import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los grados (°C): ");
        int grados = scanner.nextInt();

        double fahrenheit = (grados * (9.0 / 5.0)) + 32;

        System.out.println("La equivalencia de " + grados + " grados centígrados en grados Fahrenheit es de " + fahrenheit + " grados Fahrenheit");
    }
}
