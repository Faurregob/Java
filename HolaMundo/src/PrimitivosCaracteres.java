public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'a';
        char caracter2 = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("caracter2 = " + caracter2);
        System.out.println("decimal = caracter2: " + (decimal == caracter2));
        System.out.println("Tipo Char corresponde en byte a: "+Character.BYTES);
        System.out.println("Tipo Char corresponde en bites a: "+Character.SIZE);
        System.out.println("Valor Maximo de un Char: "+Character.MAX_VALUE);
        System.out.println("Valor Minimo de un Float: "+Character.MIN_VALUE+"\n");

        char espacio = ' '; //Agregar un espacio.
        char retroceso = '\b'; //Borrar un espacio.
        char tabulador = '\t'; //Agregar 5 espacios a la derecha.
        char nuevaLinea  = '\n'; //Salto de Linea.
        char retornoCarro = '\r'; //


    }


}
