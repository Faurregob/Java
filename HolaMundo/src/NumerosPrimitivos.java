public class NumerosPrimitivos {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: "+Byte.BYTES);
        System.out.println("Tipo byte corresponde en byte a: "+Byte.SIZE);
        System.out.println("Valor Maximo de un byte: "+Byte.MAX_VALUE);
        System.out.println("Valor Minimo de un byte: "+Byte.MIN_VALUE+"\n");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a: "+Short.BYTES);
        System.out.println("Tipo Short corresponde en bites a: "+Short.SIZE);
        System.out.println("Valor Maximo de un Short: "+Short.MAX_VALUE);
        System.out.println("Valor Minimo de un Short: "+Short.MIN_VALUE+"\n");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo INT corresponde en byte a: "+Integer.BYTES);
        System.out.println("Tipo INT corresponde en bites a: "+Integer.SIZE);
        System.out.println("Valor Maximo de un INT: "+Integer.MAX_VALUE);
        System.out.println("Valor Minimo de un INT: "+Integer.MIN_VALUE+"\n");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Long corresponde en byte a: "+Long.BYTES);
        System.out.println("Tipo Long corresponde en bites a: "+Long.SIZE);
        System.out.println("Valor Maximo de un Long: "+Long.MAX_VALUE);
        System.out.println("Valor Minimo de un Long: "+Long.MIN_VALUE+"\n");

        float numeroFloat = 9223372036854775807L;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Tipo Float corresponde en byte a: "+Float.BYTES);
        System.out.println("Tipo Float corresponde en bites a: "+Float.SIZE);
        System.out.println("Valor Maximo de un Float: "+Float.MAX_VALUE);
        System.out.println("Valor Minimo de un Float: "+Float.MIN_VALUE+"\n");

        System.exit(0);
    }
}
