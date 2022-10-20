
import java.util.Scanner;
public class TallerCalificableEjer3 {

    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {


        int ValorFactura=0;
        int IVA=665;
        int ValorFacturaTotal=0;

        System.out.println("Ingrese el valor de la factura");
        ValorFactura= keyboard.nextInt();

        ValorFacturaTotal= ValorFactura+IVA;
        System.out.println("El valor de su factura con IVA inluido es"+ ValorFacturaTotal);

    }
}
