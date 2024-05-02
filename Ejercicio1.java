import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Calcular la suma de los dos números
        int suma = numero1 + numero2;

        // Mostrar el resultado de la suma
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
