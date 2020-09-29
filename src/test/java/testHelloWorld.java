import org.junit.jupiter.api.Test;
import static boyi.HelloWorld.printNum;

public class testHelloWorld {

    @Test
    public void testhello1(){
        assert 3==printNum(3);

    }
    @Test
    public void testhello2(){
        assert 0==printNum(2);

    }
}
