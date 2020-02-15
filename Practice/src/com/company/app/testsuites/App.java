package com.company.app.testsuites;

import org.testng.Assert;
import org.testng.annotations.Test;

public class App 
{
	@Test()
    public void testMethodOne() {
        System.out.println("Test method one");
    }
 
    @Test()
    public void testMethodTwo() {
        System.out.println("Test method two");
    }
 
    @Test()
    public void testMethodThree() {
        System.out.println("Test method three");
    }
 
    @Test()
    public void testMethodFour() {
        System.out.println("Test method Four");
    }
    
    @Test()
    public static void print( )
    {
        System.out.println( "Hello World!" );
    }
    
    
    @Test()
    public static void print1( )
    {
        System.out.println( "Method Fail" );
        Assert.assertTrue(false);
    }
    
    
    
}
