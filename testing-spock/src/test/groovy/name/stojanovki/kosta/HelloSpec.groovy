package name.stojanovki.kosta;

import spock.lang.Specification

class HelloSpec extends Specification {

    def hello = new Hello();

    def sayHello() {
        given: "A person's name is given as a method parameter."
        def greeting = hello.sayHello("Kosta");

        expect: "Should say hello to the person whose name is given as a method parameter"
        greeting == "Hello Kosta";
    }
}