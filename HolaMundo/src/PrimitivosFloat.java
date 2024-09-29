public class PrimitivosFloat {

    static float varFlotante = 45.45f; //Variable constante en defult sin modificador de acceso.

    public static void main(String[] args) {
        float realFloat = 1.0f;
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 1.5e4f;
        System.out.println("realFloat2 = " + realFloat2);

        float realFloat3 = 1.5e-10f;
        System.out.println("realFloat3 = " + realFloat3);
        System.out.println("Tipo Float corresponde en byte a: "+Float.BYTES);
        System.out.println("Tipo Float corresponde en bites a: "+Float.SIZE);
        System.out.println("Valor Maximo de un Float: "+Float.MAX_VALUE); //340282350000000000000000000000000000000.00E38
        System.out.println("Valor Minimo de un Float: "+Float.MIN_VALUE+"\n");

        double numeroDouble = 3.4028235E38;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Tipo Double corresponde en byte a: "+Double.BYTES);
        System.out.println("Tipo Double corresponde en bites a: "+Double.SIZE);
        System.out.println("Valor Maximo de un Double: "+Double.MAX_VALUE);
        System.out.println("Valor Minimo de un Double: "+Double.MIN_VALUE+"\n");

        //var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
