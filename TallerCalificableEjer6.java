import java.util.Scanner;

public class TallerCalificableEjer6 {

    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int n=0;

        System.out.println("Dijite un numero de 5 cifras");
        n= keyboard.nextInt();

        while (n>10) {
            n = n / 10;
        }
        System.out.println("El primer digito del numero es " + n + "");

    }
}