import java.util.Scanner;
public class TallerCalificableEjer4 {

    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int numeroSemana=0;


        System.out.println("Dijite un numero del 1 al 7");
        numeroSemana= keyboard.nextInt();

        switch (numeroSemana) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}