import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int nro = scanner.nextInt();

        int doble = nro * 2;

        int triple = nro * 3;

        double raizCuadrada = Math.sqrt(nro);

        System.out.println("El número entero que ingresó fue: " + nro);
        System.out.println("El doble del numero entero es: " + doble);
        System.out.println("El triple del numero entero es: " + triple);
        System.out.println("La raíz cuadrada del numero entero es: " + raizCuadrada);
    }
}
