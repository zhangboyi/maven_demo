import junit.framework.TestCase;

import static boyi.HelloWorld.printNum;
import static boyi.HelloWorld.printStr;

public class TestHelloWorld extends TestCase {


    public void testHello1(){
        assertTrue(3==printNum(3)) ;

    }

    public void testHello2H(){
        assert 0==printNum(2);

    }

    public void testHello3(){
        assert "hello".equals(printStr("hello"));
    }
}
