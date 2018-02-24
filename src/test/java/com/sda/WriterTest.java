package com.sda;

import org.junit.Assert;
import org.junit.Test;

public class WriterTest {
    @Test
    public void sayHelloWithGivenNameTest(){
        Writer writer = new Writer();
        String name = "Arek";
        String resault = writer.sayHello(name);

        Assert.assertEquals( "Expected hello message is invalid","Hello, Arek!", resault);
    }

    @Test

    public void sayHelloWithNoNameSpecified(){

        Writer writer = new Writer();
        String name="";
        String result = writer.sayHello("");
        Assert.assertEquals("Message for emtpy name should be different", "Hello my friend!", result);

    }
     public void sayHelloWithNullName(){
        Writer writer = new Writer();
        String name = null;
        String result = writer.sayHello(name);
        Assert.assertEquals("Hello, my friend!", result);
     }
}
