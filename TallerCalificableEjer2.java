
import java.util.Scanner; //Importante para datos por teclado
public class TallerCalificableEjer2 {
    public static Scanner keyboard = new Scanner(System.in); //Le decimos que dijite x valor por teclado, SIEMPRE VA
                                                             //ARRIBA DEL MAIN COMO TAL
    public static void main(String[] args) {

        int valorPesos=0;
        double DOLAR = 3.895;
        double resultado=0;


        valorPesos = keyboard.nextInt(); //Decimos que la variable nombrada se le da valor por teclado

        resultado = valorPesos*DOLAR;
        System.out.println("El resultado es" + resultado);

    }
}
