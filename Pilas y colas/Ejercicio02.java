import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1) Llegada");
            System.out.println("2) Atender");
            System.out.println("3) Mostrar cola");
            System.out.println("4) Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    cola.enqueue(nombre);
                    break;
                case 2:
                    if (!cola.isEmpty()) {
                        System.out.println("Atendiendo a: " + cola.dequeue());
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 3:
                    cola.mostrar();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
}