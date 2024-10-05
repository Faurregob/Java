import javax.swing.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try{
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        } catch(InputMismatchException e){
            System.out.println("Error, Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("NumeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Numero Binario de " + numeroDecimal+ " = "+Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "Numero Octal de " + numeroDecimal+" = "+Integer.toOctalString(numeroDecimal);
        String resultadoHexa = "Numero Hexadecimal de  " + numeroDecimal+" = "+Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        System.out.println(mensaje);
    }
}
