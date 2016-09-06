package name.stojanovki.kosta.simple;

import spock.lang.Specification
 
class GeneralMapWhenThenSpock extends Specification {
 
    def 'Get value from a map'() {
 
        given: 'Map contains one key-value pair'
        def incorrectKey = 'incorrectKey'
        def key = 'key'
        def value = 1
 
        def map = new HashMap()
        map.put(key, value)
 
        when: 'A value is found with the given key'
        def found = map.get(key)
 
        then: 'Should return the found value'
        found == value
 
        when: 'A value is not found with the given key'
        found = map.get(incorrectKey)
 
        then: 'Should return null'
        found == null
    }
}