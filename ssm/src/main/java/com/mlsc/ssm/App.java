package com.mlsc.ssm;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        TTTT t = new TTTT<>();
        t.setKey("111");
        t.setValue(222);
        System.out.println(t.getKey().getClass()+"--"+t.getValue().getClass());
    }
}
