/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package kapitel_03;

public class StringPooling {
    private static final String STRING_AB = "ab";
    private static final String STRING_C = "c";

    private static final String STRING_1 = "abc";
    private static final String STRING_2 = "abc";
    private static final String STRING_3 = STRING_2;
    private static final String STRING_4 = STRING_AB + STRING_C;


    public static void main(String[] args) {
        String string_5 = "a" + ".b.".charAt(1) + "c";
        String string_6 = string_5.intern();

        System.out.println("STRING_1 = " + STRING_1);
        System.out.println("STRING_2 = " + STRING_2);
        System.out.println("STRING_3 = " + STRING_3);
        System.out.println("STRING_4 = " + STRING_4);
        System.out.println("string_5 = " + string_5);
        System.out.println("string_6 = " + string_6);

        System.out.println("STRING_1.equals(STRING_1) = " + STRING_1.equals(STRING_1));
        System.out.println("STRING_1.equals(STRING_2) = " + STRING_1.equals(STRING_2));
        System.out.println("STRING_1.equals(STRING_3) = " + STRING_1.equals(STRING_3));
        System.out.println("STRING_1.equals(STRING_4) = " + STRING_1.equals(STRING_4));
        System.out.println("STRING_1.equals(string_5) = " + STRING_1.equals(string_5));
        System.out.println("STRING_1.equals(string_6) = " + STRING_1.equals(string_6));

        System.out.println("(STRING_1==STRING_1) = " + (STRING_1 == STRING_1));
        System.out.println("(STRING_1==STRING_2) = " + (STRING_1 == STRING_2));
        System.out.println("(STRING_1==STRING_3) = " + (STRING_1 == STRING_3));
        System.out.println("(STRING_1==STRING_4) = " + (STRING_1 == STRING_4));
        System.out.println("(STRING_1==string_5) = " + (STRING_1 == string_5));
        System.out.println("(STRING_1==string_6) = " + (STRING_1 == string_6));
    }
}
