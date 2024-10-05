import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("NumeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Numero Binario de " + numeroDecimal+ " = "+Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("NumeroBinario = " + numeroBinario);

        String resultadoOctal = "Numero Octal de " + numeroDecimal+" = "+Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("NumeroOctal = " + numeroOctal);

        String resultadoHexa = "Numero Hexadecimal de  " + numeroOctal+" = "+Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);

        int numeroHex = 0x1F4;
        System.out.println("NumeroHEx = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        JOptionPane.showMessageDialog(null, mensaje);

        System.exit(000);


    }
}
