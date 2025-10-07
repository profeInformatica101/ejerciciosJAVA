import java.util.Scanner;

public class RepasoU1 {
 public static void main(String [] args) {
         // Mostrar información pidiendo edad al usuario
          System.out.println("Dime tu edad: ");     
          int edad;
          Scanner sc = new Scanner(System.in);
          edad = sc.nextInt();
          System.out.println("Tu edad es "+ edad);
          
          if(edad >= 18) {
                 System.out.println("Eres mayor de edad");                                                                                                                                                                                                                                                                                                                                       
          }else {
           System.out.println("Eres menor de edad");                                                                                                                                                                                                                                                                                                                                      
          }
       
 }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           

}
