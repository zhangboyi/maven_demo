import org.junit.jupiter.api.Test;
import static boyi.HelloWorld.printNum;
import static boyi.HelloWorld.printStr;

public class testHelloWorld {

    @Test
    public void testhello1(){
        assert 3==printNum(3);

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
