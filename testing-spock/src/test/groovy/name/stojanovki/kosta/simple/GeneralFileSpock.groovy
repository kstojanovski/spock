package name.stojanovki.kosta.simple;

import spock.lang.Specification;

class GeneralFileSpock extends Specification {

	def TEST_RESOURCE_PATH = "src/test/resources";
	def path = new java.io.File(TEST_RESOURCE_PATH).getAbsolutePath();
	
	def 'Create a new file'() {

		setup:
		def file = new File(path, "foo.txt")

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