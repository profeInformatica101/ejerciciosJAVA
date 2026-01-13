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
    	
    	CuentaCorriente cc1 = new CuentaCorriente(faker.artist().name(), "12345678Z");
    	cc1.nombre = "Probando";
    	cc1.dni = "12345679A";
    	CuentaCorriente cc2 = new CuentaCorriente(5.0);
        CuentaCorriente cc3 = new CuentaCorriente(5, -10, "12345678Z");
  
       /** #### cc1 ### */
        System.out.println("cc1");
        cc1.mostrarInformacion();
        cc1.sacarDinero(49);
        cc1.mostrarInformacion();
        cc1.ingresarDinero(49);
        cc1.mostrarInformacion();
        System.out.println("\n\n");
        
        
        /** ### cc2 ### */
        System.out.println("cc2");
        cc2.mostrarInformacion();
        cc2.sacarDinero(2);
        cc2.mostrarInformacion();
        cc2.ingresarDinero(2);
        cc2.mostrarInformacion();
        System.out.println("\n\n");
        
        /** ### cc3 ### */
        System.out.println("cc3");
        cc3.mostrarInformacion();
        cc3.sacarDinero(2);
        cc3.mostrarInformacion();
        cc3.ingresarDinero(2);
        cc3.mostrarInformacion();
        
        
        System.out.println(CuentaCorriente.NOMBREBANCO);
    }
}
