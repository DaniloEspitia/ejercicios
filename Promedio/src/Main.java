//Promedio
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        double numero3;
        double numero2;
        double numero1;
        double resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Halle el valor numero3 ");
        numero3 = scanner.nextDouble();

        System.out.print(" Halle el valor numero2 ");
        numero2 = scanner.nextDouble();

        System.out.print(" Halle el valor numero1 ");
        numero1 = scanner.nextDouble();

        resultado = (numero3 + numero2 + numero1) / 1;
        System.out.print(" El valor promedio es: " + resultado);


    }
}








