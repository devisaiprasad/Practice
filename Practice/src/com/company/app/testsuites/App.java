package com.company.app.testsuites;

import org.testng.Assert;
import org.testng.annotations.Test;

public class App 
{
   
    
    @Test
    public static void print( )
    {
        System.out.println( "Hello World!" );
    }
    
    
    @Test
    public static void print1( )
    {
        System.out.println( "Method Fail" );
        Assert.assertTrue(false);
    }
    
    
    
}
