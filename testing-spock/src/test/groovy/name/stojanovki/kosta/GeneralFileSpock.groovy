package name.stojanovki.kosta;

import spock.lang.Specification;

class GeneralFileSpock extends Specification {

	def testResourcesPath = new File(getClass().getClassLoader().getResource(".").getFile()).getAbsolutePath(); 
	
	def 'Create a new file'() {

		setup:
		def file = new File(testResourcesPath + "/tmp/foo.txt")

		when: 'A new file is created'
		file.createNewFile()

		then: 'Should create a new file'
		file.exists() == true
		file.isFile() == true
		file.isDirectory() == false

		cleanup:
		file.delete()
	}
}