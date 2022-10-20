import java.util.Scanner;

public class TallerCalificableEjer8 {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int numeros=0;
        int contador=0;
        double prom=0;
        double suma=0;

        do {

            System.out.print("El programa calcula el promedio de x cantidad de numeros, Si el numero " +
                    "es negativo, El programa se va a detener ");
            numeros = keyboard.nextInt();

            if (numeros > 0) {
                suma += numeros;
                contador++;
            }

        }while (numeros >0);
        if (contador >1)
        System.out.println("El promedio de los numeros "+ contador + "ingresados es: " + (suma/contador) );

        else
            System.out.println("Numero ingresado: " + suma);
        }
}
