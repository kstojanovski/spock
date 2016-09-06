package name.stojanovki.kosta.urlvalidator

import static org.junit.Assert.*;

import org.junit.Test

import name.stojanovki.kosta.urlvalidator.MyUriValidator;;

class MyUrlValidatorSpock extends spock.lang.Specification{

	def "test-multiple-urls"() {
		given: "create the validator object"
		def myValidator = new MyUriValidator()
		myValidator.allowFileUrls(true)
		myValidator.allowInternationlizedDomains(false)
		myValidator.allowReservedDomains(false)
		myValidator.allowCustomPorts(false)

		expect: "Validate a URL and see if it is valid"
		valid == myValidator.isValidUrl(aTestUrl)

		where:
		aTestUrl | valid
		"http://www.google.com" | true
		"file://home/users"| true
		"http://localhost:8080/" | false
	}
}
