package es.iescamas.estructura;

public class App {

    public static void main(String[] args) {
        listaEjemplo();
        pilaEjemplo();
        colaEjemplo();
        conjuntoEjemplo();
    }

    public static void listaEjemplo() {
        System.out.println("=== ListaArray ===");
        ListaArray lista = new ListaArray();

        lista.addFinal(10);
        lista.addFinal(20);
        lista.addFinal(30);

        System.out.println("Lista: " + lista);                // [10, 20, 30]
        System.out.println("Size: " + lista.size());          // 3
        System.out.println("get(1): " + lista.get(1));        // 20

        lista.remove(1); // elimina el 20
        System.out.println("Tras remove(1): " + lista);       // [10, 30]
        System.out.println();
    }

    public static void pilaEjemplo() {
        System.out.println("=== PilaArray (LIFO) ===");
        PilaArray pila = new PilaArray();

        pila.push(5);
        pila.push(7);
        pila.push(9);

        System.out.println("Pila: " + pila);
        System.out.println("pop(): " + pila.pop());           // 9
        System.out.println("Tras pop: " + pila);
        System.out.println();
    }

    public static void colaEjemplo() {
        System.out.println("=== ColaArray (FIFO) ===");
        ColaArray cola = new ColaArray();

        // --- OPCIÓN A (si tu cola usa add/remove) ---
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);

        System.out.println("Cola: " + cola);
        System.out.println("dequeue(): " + cola.dequeue());     // 1
        System.out.println("Tras dequeue: " + cola);
        System.out.println();

 
    }

    public static void conjuntoEjemplo() {
        System.out.println("=== ConjuntoArray (sin repetidos) ===");
        ConjuntoArray conjunto = new ConjuntoArray();

        System.out.println("add(3): " + conjunto.add(3));      // true
        System.out.println("add(5): " + conjunto.add(5));      // true
        System.out.println("add(3): " + conjunto.add(3));      // false (repetido)

        System.out.println("Conjunto: " + conjunto);           // [3, 5] (según toString)
        System.out.println("contains(5): " + conjunto.contains(5)); // true

        System.out.println("removeValue(5): " + conjunto.removeValue(5)); // true
        System.out.println("removeValue(9): " + conjunto.removeValue(9)); // false

        System.out.println("Conjunto final: " + conjunto);
        System.out.println();
    }
}
