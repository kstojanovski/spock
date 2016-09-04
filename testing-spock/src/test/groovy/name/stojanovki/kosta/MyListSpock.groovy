package name.stojanovki.kosta;

import spock.lang.Shared

class MyListSpock extends spock.lang.Specification {
	
	def myList= new MyList().getTerms();
	def setup() {
		myList.add("test");
		myList.add("test2");
	}
	def expectedList = ["test", "test2"]
	
	def "check lists same"() {
		
		when:
		def expectedResults = expectedList
		def realResults = myList

		then:
		realResults.size() == expectedResults.size()
		realResults.containsAll(expectedResults)
		
	}

	def "check lists equal"() {
		
		when:
		def expectedResults = expectedList
		def realResults = myList

		then:
		realResults == expectedResults
	}
}