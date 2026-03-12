package es.iescamas.servicio;

import es.iescamas.interfaz.Identificable;
import es.iescamas.interfaz.Mostrable;
import es.iescamas.interfaz.Repositorio;

public class RepositorioMemoria<T extends Identificable> implements Repositorio<T> {

    private Identificable[] datos;
    private int contador;

    public RepositorioMemoria() {
        this.datos = new Identificable[10];
        this.contador = 0;
    }

    private void ampliarArray() {
        Identificable[] nuevo = new Identificable[datos.length * 2];

        for (int i = 0; i < datos.length; i++) {
            nuevo[i] = datos[i];
        }

        datos = nuevo;
    }

    @Override
    public void add(T item) {
        if (item == null) {
            return;
        }

        if (contador == datos.length) {
            ampliarArray();
        }

        datos[contador] = item;
        contador++;
    }

    @Override
    public boolean remove(T item) {
        if (item == null) {
            return false;
        }

        for (int i = 0; i < contador; i++) {
            if (datos[i].getId().equals(item.getId())) {
                for (int j = i; j < contador - 1; j++) {
                    datos[j] = datos[j + 1];
                }

                datos[contador - 1] = null;
                contador--;
                return true;
            }
        }

        return false;
    }

    @Override
    public T findById(String id) {
        if (id == null) {
            return null;
        }

        for (int i = 0; i < contador; i++) {
            if (datos[i].getId().equalsIgnoreCase(id)) {
                return (T) datos[i];
            }
        }

        return null;
    }
    public void mostrarListado() {
        if (contador == 0) {
            System.out.println("No hay productos en el repositorio.");
            return;
        }

        System.out.println("ID     | NOMBRE                    |   PRECIO | CATEGORIA              | CADUCIDAD");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < contador; i++) {
            if (datos[i] instanceof Mostrable) {
                ((Mostrable) datos[i]).mostrar();
            } else {
                System.out.println(datos[i]);
            }
        }
    }
    @Override
    public int size() {
        return contador;
    }
}