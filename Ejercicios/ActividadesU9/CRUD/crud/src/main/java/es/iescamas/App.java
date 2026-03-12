package es.iescamas;

import java.time.LocalDate;
import java.util.Scanner;

import es.iescamas.interfaz.Repositorio;
import es.iescamas.modelo.CategoriaProducto;
import es.iescamas.modelo.Producto;
import es.iescamas.servicio.RepositorioMemoria;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RepositorioMemoria<Producto> repositorio = new RepositorioMemoria();

        Producto[] productos = generarProductos();

        for (Producto p : productos) {
            repositorio.add(p);
        }

        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    agregarProducto(sc, repositorio);
                    break;
                case 2:
                    eliminarProducto(sc, repositorio);
                    break;
                case 3:
                    buscarProducto(sc, repositorio);
                    break;
                case 4:
                    System.out.println("Total productos: " + repositorio.size());
                    repositorio.mostrarListado();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n===== MENÚ REPOSITORIO =====");
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Buscar producto por ID");
        System.out.println("4. Mostrar total de productos");
        System.out.println("0. Salir");
    }

    public static void agregarProducto(Scanner sc, Repositorio<Producto> repositorio) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Precio: ");
        double precio = Double.parseDouble(sc.nextLine());

        System.out.println("Categorías disponibles:");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria);
        }

        System.out.print("Categoría: ");
        CategoriaProducto categoria = CategoriaProducto.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Fecha de caducidad (AAAA-MM-DD): ");
        LocalDate fechaCaducidad = LocalDate.parse(sc.nextLine());

        Producto producto = new Producto(nombre, precio, categoria, fechaCaducidad);
        repositorio.add(producto);

        System.out.println("Producto agregado correctamente con ID: " + producto.getId());
    }

    public static void eliminarProducto(Scanner sc, Repositorio<Producto> repositorio) {
        System.out.print("Introduce el ID del producto a eliminar: ");
        String id = sc.nextLine();

        Producto producto = repositorio.findById(id);

        if (producto == null) {
            System.out.println("No existe un producto con ese ID.");
            return;
        }

        boolean eliminado = repositorio.remove(producto);

        if (eliminado) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el producto.");
        }
    }

    public static void buscarProducto(Scanner sc, Repositorio<Producto> repositorio) {
        System.out.print("Introduce el ID del producto: ");
        String id = sc.nextLine();

        Producto producto = repositorio.findById(id);

        if (producto == null) {
            System.out.println("Producto no encontrado.");
        } else {
            producto.mostrar();
        }
    }

    public static Producto[] generarProductos() {
        return new Producto[] {
            new Producto("Agua mineral 5L", 2.50, CategoriaProducto.AGUA_POTABLE, LocalDate.of(2029, 1, 1)),
            new Producto("Atún en lata", 2.10, CategoriaProducto.ALIMENTO_NO_PERECEDERO, LocalDate.of(2028, 3, 10)),
            new Producto("Sardinas en lata", 1.90, CategoriaProducto.ALIMENTO_NO_PERECEDERO, LocalDate.of(2028, 5, 12)),
            new Producto("Caballa en lata", 2.20, CategoriaProducto.ALIMENTO_NO_PERECEDERO, LocalDate.of(2028, 6, 15)),
            new Producto("Galletas", 1.40, CategoriaProducto.ALIMENTO_NO_PERECEDERO, LocalDate.of(2027, 9, 10)),
            new Producto("Pan tostado", 1.60, CategoriaProducto.ALIMENTO_NO_PERECEDERO, LocalDate.of(2027, 7, 18)),
            new Producto("Crackers", 1.70, CategoriaProducto.ALIMENTO_NO_PERECEDERO, LocalDate.of(2027, 8, 20)),
            new Producto("Barritas energéticas", 2.80, CategoriaProducto.SUPERVIVENCIA, LocalDate.of(2027, 11, 5)),
            new Producto("Chocolate negro", 2.40, CategoriaProducto.ALIMENTO_NO_PERECEDERO, LocalDate.of(2028, 1, 10)),
            new Producto("Frutos secos", 3.10, CategoriaProducto.ALIMENTO_NO_PERECEDERO, LocalDate.of(2027, 10, 15))
        };
    }
}