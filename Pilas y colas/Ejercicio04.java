import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal positivo: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Binario: 0");
            return;
        }

        Pila pila = new Pila();

        while (n > 0) {
            pila.push(String.valueOf(n % 2));
            n /= 2;
        }

        StringBuilder binario = new StringBuilder();
        while (!pila.isEmpty()) {
            binario.append(pila.pop());
        }

        System.out.println("Binario: " + binario.toString());
    }
}