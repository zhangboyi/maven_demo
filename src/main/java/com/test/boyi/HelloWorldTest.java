package com.test.boyi;

import com.example.boyi.HelloWorld;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    HelloWorld helloWorld = new HelloWorld();

    @Test
    public void testHello1(){
        Assert.assertTrue(3==helloWorld.printNum(3)) ;

    }
    @Test
    public void testHello2H(){
        assert 0==helloWorld.printNum(2);

    }
    @Test
    public void testHello3(){
        assert "hello".equals(helloWorld.printStr("hello"));
    }
}
