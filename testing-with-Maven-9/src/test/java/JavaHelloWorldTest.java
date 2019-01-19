

public class JavaHelloWorldTest {

    // POJO test
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert ("Hello World".equals(javaHelloWorld.getHello()));
    }
}