package guru.springframework

import spock.lang.Specification

// Spock test written in Groovy
class JavaHelloWorldSpockTest extends Specification {
    def "GetHello"() {
        when:
        def foo = "123"

        then:
        true
    }
}
