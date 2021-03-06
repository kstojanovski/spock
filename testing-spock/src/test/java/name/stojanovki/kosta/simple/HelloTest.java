package name.stojanovki.kosta.simple;

import org.junit.Before;
import org.junit.Test;

import name.stojanovki.kosta.simple.Hello;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloTest {

	private Hello hello;

	@Before
	public void createHelloObject() {
		hello = new Hello();
	}

	@Test
	public void sayHello_ShouldSayHelloToPersonWhoseNameIsGivenAsMethodParameter() {
		String greeting = hello.sayHello("Kosta");
		assertThat(greeting, is("Hello Kosta"));
	}
	
}
