package com.test.boyi;

import static com.example.boyi.HelloWorld.printNum;
import static com.example.boyi.HelloWorld.printStr;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testHello1(){
        Assert.assertTrue(3==printNum(3)) ;

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
