package es.iescamas.estructura;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ListaArray lista = new ListaArray();
        lista.addFinal(3);
        lista.addFinal(4);
        lista.addFinal(5);
        lista.remove(0);
        System.out.println(lista.toString());
    }
}
