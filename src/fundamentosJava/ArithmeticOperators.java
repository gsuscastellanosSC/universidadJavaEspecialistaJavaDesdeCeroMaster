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
public class ArithmeticOperators {

    public static void main(String args[]) {
        System.out.println("\nSuma:     ");
        int a = 3, b = 2, ans = a + b;
        System.out.println("        a + b = " + ans);

        System.out.println("\nResta:    ");
        ans = a - b;
        System.out.println("        a - b = " + ans);

        System.out.println("\nMultiplicación: ");
        ans = a * b;
        System.out.println("        a * b = " + ans);

        System.out.println("\nDivición:     ");
        double ansDiv = (double) a / b;
        System.out.println("        a / b = " + ansDiv);

        System.out.println("\nMódulo");
        ans = a % b;
        System.out.println("        a % b = " + ans);

        System.out.println("\nValida si es a es Par");
        if (a % 2 == 0) {
            System.out.println(a + " es Par");
        } else {
            System.out.println(a + " es Impar");
        }

        System.out.println("\nIncrementar: ");
        System.out.println("Suma:   ");
        ans = a += b;
        System.out.println("            a += b = " + ans);

        System.out.println("    Resta:      ");
        ans = a -= b;
        System.out.println("            a -= b = " + ans);

        System.out.println("    Multiplicación:      ");
        ans = a *= b;
        System.out.println("            a *= b = " + ans);

        System.out.println("    Divición:      ");
        ans = a /= b;
        System.out.println("            a /= b = " + ans);

        System.out.println("    Módulo:      ");
        ans = a %= b;
        System.out.println("            a %= b = " + ans);
    }
}