package name.stojanovki.kosta.simple;

import name.stojanovki.kosta.simple.MyMap;
import spock.lang.Shared

class MyMapSpock extends spock.lang.Specification {
	
	def myMap= new MyMap().getMyMap();
	def setup() {
		myMap.put("test", "test");
		myMap.put("test2", "test2");
	}
	def expectedMap = ["test":"test", "test2":"test2"]
	
	def "check map same"() {
		
		when:
		def expectedResults = expectedMap
		def realResults = myMap

		then:
		realResults.size() == expectedResults.size()
		realResults.keySet().containsAll(expectedResults.keySet())
		realResults.values().containsAll(expectedResults.values())
	}

	def "check map equal"() {
		
		when:
		def expectedResults = expectedMap
		def realResults = myMap

		then:
		realResults == expectedResults
	}
}