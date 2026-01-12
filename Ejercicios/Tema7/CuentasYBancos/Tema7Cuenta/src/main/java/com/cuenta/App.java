package com.cuenta;

import com.github.javafaker.Faker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Faker faker = new Faker();
        System.out.println( faker.number().randomDouble(2, 1, 100) );
    }
}
