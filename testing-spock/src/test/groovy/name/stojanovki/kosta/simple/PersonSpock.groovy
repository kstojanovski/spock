package name.stojanovki.kosta.simple;

import name.stojanovki.kosta.simple.Person;
import spock.lang.Shared

class PersonSpock extends spock.lang.Specification {
	
	@Shared
	def p = new Person();
	
    def "check first and last name"() {
        expect:
        personProperty == value;

        where:
        personProperty     | value
        p.firstname  | "Kosta"
        p.lastname   | "Stojanovski"
    }

}   