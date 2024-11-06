package Example1.TiposDatos;

public class TiposDatos {
    public static void main(String[] args) {
        /** Numero */
        byte myByte = 126;
        System.out.println("Numero tipo byte: "+myByte);

        int myInt = 2341;
        System.out.println("Numero tipo int: "+myInt);

        short myShort = 213;
        System.out.println("Numero tipo short: "+myShort);

        long myLong = 4637282644646L;
        System.out.println("Numero tipo long: "+myLong);

        /** Bool */
        boolean myBool = false;
        System.out.println("Dato tipo booleano: "+myBool);

        /** Decimal */
        float myFloat = 9.23121F;
        System.out.println("Decimal tipo float: "+myFloat);

        double myDouble = 7.312334123;
        System.out.println("Decimal tipo double: "+myDouble);

        /** Sting */
        String myString = "Hola Mundo";
        System.out.println("Cadena tipo String: "+myString);

        char myChar = '@';
        System.out.println("Cadena tipo char: "+myChar);

        /** Constante */
        final String Constante = "Esta variable es constante";
        System.out.println(Constante);
    }
}