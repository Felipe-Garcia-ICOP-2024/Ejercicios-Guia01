import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.next();

        System.out.println("Tu nombre es: " + nombre);

        scanner.close();
    }
}
