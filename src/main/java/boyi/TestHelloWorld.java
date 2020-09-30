package boyi;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import static boyi.HelloWorld.printNum;
import static boyi.HelloWorld.printStr;
import static org.junit.Assert.assertTrue;

public class TestHelloWorld extends TestCase {

    @Test
    public void testHello1(){
        assertTrue(3==printNum(3)) ;

    }
    @Test
    public void testHello2H(){
        assert 0==printNum(2);

    }
    @Test
    public void testHello3(){
        assert "hello".equals(printStr("hello"));
    }
}
