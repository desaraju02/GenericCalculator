package com.nag.GenericCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public int getTempInF(String tempInC)
    {
    	return Integer.parseInt(tempInC);
    }
    
    public int getTempInC(String tempInF)
    {
    	return new Integer(tempInF).intValue();
    }
    
    public int getTempInK(String tempInC)
    {
    	return new Integer(tempInC).intValue();
    }
    
    public int getTempInM(String tempInC)
    {
    	return new Integer(tempInC).intValue();
    }
}
