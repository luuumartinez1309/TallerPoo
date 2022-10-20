import java.util.Scanner;
public class TallerCalificableEjer9 {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int numeros = 0;
        int positivos = 0;
        int negativos = 0;


        System.out.println("Intgrese 10 numeros enteros");

        for (int i = 0; i <= 10; i++) {
            numeros = keyboard.nextInt();

            if (numeros > 0) {
                positivos++;
            }

            if (numeros < 0) {
                negativos++;
            }

            System.out.println("Los numeros positivos son: " + positivos + "");
            System.out.println("Los numeros negativos son: " + negativos + "");


        }

    }
}