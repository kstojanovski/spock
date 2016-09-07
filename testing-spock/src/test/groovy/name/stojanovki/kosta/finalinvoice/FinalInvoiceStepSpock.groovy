package name.stojanovki.kosta.finalinvoice

import static org.junit.Assert.*;

import org.junit.Test;

class FinalInvoiceStepSpock extends spock.lang.Specification{

	def "different-customer-types-test"() {
		setup:
		def printerService = Mock(PrinterService)
		def emailService = Mock(EmailService)
		def customer = new Customer()
		def finalInvoiceStep = new FinalInvoiceStep(printerService, emailService)
		def invoice = new Invoice()

		when: "customer is normal and has an email inbox"
		customer.wantsEmail(true)
		finalInvoiceStep.handleInvoice(invoice, customer)

		then: "nothing should be printed. Only an email should be sent"
		0 * printerService.printInvoice(invoice)
		1 * emailService.sendInvoice(invoice,customer.getEmail())

		when: "customer is old fashioned and prefers snail mail"
		customer.wantsEmail(false)
		finalInvoiceStep.handleInvoice(invoice, customer)

		then: "no email is available. A copy must have been sent to the printer"
		0 * emailService.sendInvoice(invoice,_)
		1 * printerService.printInvoice(invoice)
	}
}