import org.junit.jupiter.api.Test;
import static boyi.HelloWorld.printNum;
import static boyi.HelloWorld.printStr;
import static org.junit.Assert.assertTrue;

public class TestHelloWorld {

    @Test
    public void testhello1(){
        assertTrue(3==printNum(3)) ;

    }
    @Test
    public void testhello2(){
        assert 0==printNum(2);

    }
    @Test
    public void testhello3(){
        assert "hello".equals(printStr("hello"));
    }
}
