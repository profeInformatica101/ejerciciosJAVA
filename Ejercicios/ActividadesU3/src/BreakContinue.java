
public class BreakContinue {
     
    
    public static void main(String []args) {
                                                                                                                                                                                                                                                                                                                                                  
                 //       0  1  2   3  4    5    6                                                                                                                                                                                                                                                                                                                   
         int numeros[] = {1, 4, 5, 10, 13, 17};                                                                                                                                                                                                                                                                                                                                              
         int num = 3;                                                                                                                                                                                                                                                                                                                                        
         //System.out.println(numeros.length);
         //System.out.println(numeros[0]);
      /*   for(int i=0; i<numeros.length;i++) {
           System.out.println(numeros[i]);                                                                                                                                                                                                                                                                                                                                     
         }*/
        /* int j=0;
         while(j<numeros.length) {
           System.out.println(numeros[j]); 
           j++;
         }*/
         
         for(int n : numeros) {
            if(n % 2 != 0) {
                System.out.println(n);
                continue;
            }
            System.out.println("Número par" + n);
         }
        
         
         
         System.out.println("Fin");
    }
    
}
