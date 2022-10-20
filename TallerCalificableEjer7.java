import java.util.Scanner;

public class TallerCalificableEjer7 {

    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int ListaMultiplos; // Cuenta
        int Multiplo; // Múltiplo
        int Contador; // Contador

        System.out.print("¿De qué número quieres los múltiplos?: ");
        Multiplo = keyboard.nextInt();

        System.out.print("¿Hasta qué número quieres la lista?: ");
        ListaMultiplos = keyboard.nextInt();

        for (Contador=1; Contador <=ListaMultiplos; Contador++) {

            if (Contador % Multiplo == 0)
                System.out.println(Contador);

        }

    }

    }