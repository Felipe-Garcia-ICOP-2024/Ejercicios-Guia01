import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.println("Tu frase es: " + frase);
        System.out.println("Tu frase en minúsculas: " + frase.toLowerCase());
        System.out.println("Tu frase en mayúsculas: " + frase.toUpperCase());

        scanner.close();
    }
}
