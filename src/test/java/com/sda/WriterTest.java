package com.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterTest {
    private Writer writer;
    @Before
    public void init() {
        writer = new Writer(); //metoda odpali sie w kazdym  tescie

    }
    @Test
    public void sayHelloWithGivenNameTest(){

        String name = "Arek";
        String resault = writer.sayHello(name);

        Assert.assertEquals( "Expected hello message is invalid","Hello, Arek!", resault);
    }

    @Test

    public void sayHelloWithNoNameSpecified(){


        String name="";
        String result = writer.sayHello("");
        Assert.assertEquals("Message for emtpy name should be different", "Hello my friend!", result);

    }
     public void sayHelloWithNullName(){
        String name = null;
        String result = writer.sayHello(name);
        Assert.assertEquals("Hello, my friend!", result);
     }

     @Test

    public void sayHelloWithCapitalizedNameSpecified(){
         String name = "AREK";
         String result = writer.sayHello(name);
         Assert.assertEquals("HELLO, AREK!", result);


     }

     @Test
    public void sayHelloWithOneEmptySpace(){
        String name = " ";
        String result = writer.sayHello(name);
        Assert.assertEquals("Hello my friend!", result);

     }

     @Test
    public void sayHelloWithBlankName(){
        String name = "    ";
        String result = writer.sayHello(name);
        Assert.assertEquals("Hello my friend!", result);
     }

}

