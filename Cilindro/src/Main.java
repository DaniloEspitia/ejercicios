import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        double pi=3.1416;
        double altura;
        double radio2;
        double resultadovol;
        double resultadoarea;
        Scanner scanner = new Scanner(System.in);
        System.out.print( " Halle el valor de altura: " );
        altura = scanner.nextDouble();
        System.out.print( " Halle el valor de radio: ");
        radio2 = scanner.nextDouble();

        resultadovol=3.1416*radio2*altura;
        resultadoarea=2*3.1416*radio2*altura;
        System.out.print(" Volumen es igual a " + resultadovol + "cm2" + " Radio es igual a " + resultadoarea + "cm2"  );











    }
}