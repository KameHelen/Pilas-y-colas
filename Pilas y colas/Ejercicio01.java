import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String texto = sc.nextLine();

        Pila pila = new Pila();

        // Apilar cada carácter como String
        for (char c : texto.toCharArray()) {
            pila.push(String.valueOf(c));
        }

        StringBuilder invertido = new StringBuilder();
        while (!pila.isEmpty()) {
            invertido.append(pila.pop());
        }

        System.out.println("Texto invertido: " + invertido.toString());
    }
}