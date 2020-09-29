import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static boyi.HelloWorld.printNum;

public class testHelloWorld {

    @Test
    public void testhello1(){
//        printNum(3);
        assert 3==printNum(3);

    }
    @Test
    public void testhello2(){
//        printNum(3);
        assert 0==printNum(2);

    }
}
