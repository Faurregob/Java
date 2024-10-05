public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        boolean datoLogico2 = Boolean.FALSE.booleanValue();
        System.out.println("datoLogico = " + datoLogico);
        System.out.println("datoLogico2 = " + datoLogico2);

        double d = 98765.43e-3; //98.76543
        System.out.println("d = " + d);
        double f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d<f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);

    }
}
