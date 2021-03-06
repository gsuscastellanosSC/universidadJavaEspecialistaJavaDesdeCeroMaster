/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

/**
 *
 * @author sc
 */
public class PrimitiveDataTypes {

    public static void main(String[] args) {
        System.out.println("\nByte: ");
        byte numByte = (byte) 129;
        System.out.println("number Byte:" + numByte);
        System.out.println("Valor minimo Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo Byte: " + Byte.MAX_VALUE);

        System.out.println("\nShort: ");
        short numShort = (short) 32769;
        System.out.println("number Short:" + numShort);
        System.out.println("Valor minimo Short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo Short: " + Short.MAX_VALUE);

        System.out.println("\nInt: ");
        int numInt = (int) 2147483647L;
        System.out.println("number Int:" + numInt);
        System.out.println("Valor minimo Int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo Int: " + Integer.MAX_VALUE);

        System.out.println("\nLong: ");
        long numLong = 9223372036854775807L;
        System.out.println("number Long:" + numLong);
        System.out.println("Valor minimo Long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo Long: " + Long.MAX_VALUE);

        System.out.println("\nFloat: ");
        float numFloat = (float) 3.4028235E38D;
        System.out.println("number Float:" + numFloat);
        System.out.println("Valor minimo Float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo Float: " + Float.MAX_VALUE);

        System.out.println("\nDouble: ");
        double numDouble = 1.7976931348623157E308;
        System.out.println("number Double:" + numDouble);
        System.out.println("Valor minimo Double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo Double: " + Double.MAX_VALUE);

        System.out.println("\nvar with int: ");
        var intNumber = 10;
        System.out.println("Int Number= " + intNumber);

        System.out.println("\nvar with Double: ");
        var doubleNumber = 10.0;
        System.out.println("Double Number= " + doubleNumber);

        System.out.println("\nvar with Float: ");
        var floatNumber = 10.0F;
        System.out.println("Float Number= " + floatNumber);

        System.out.println("\nchar: ");
        char myChar = '!';
        myChar = '\u0021';//Code
        myChar = 33;      //Decimal
        myChar = 041;     //Octal  
        System.out.println("Char = " + myChar);
        int variableIntUnicode = '!';
        System.out.println("Al asignar el simbolo a un int retorna el valor Decimal: " + variableIntUnicode);

        System.out.println("\nBoolean: ");
        boolean typeBoolean = false;
        System.out.println("Type Boolean = " + typeBoolean);

        System.out.println("\nConversión de tipos String to Integer: ");
        String edad = "20";
        System.out.println(Integer.parseInt(edad) + 25);

        System.out.println("\nConversión de tipo String to Double: ");
        String pi = "3.1416";
        System.out.println("pi+1 = " + (Double.parseDouble(pi) + 1));

        System.out.println("\nConversión de Tipo Int to String");
        String stringAge = String.valueOf(10);
        System.out.println("StringAge = " + stringAge);
        
        System.out.println("\nConversión de Tipo String to chart");
        char chartherVariable = "hello".charAt(0);
        System.out.println("ChartherVariable = " + chartherVariable);
    }
}
