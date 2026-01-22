package es.radio;

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
        System.out.println( faker.pokemon().name());
        
        
        Sintonizador sintonizador = new Sintonizador();
        
    }
}
