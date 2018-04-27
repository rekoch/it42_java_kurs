/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag04.stringpooling;

public class StringPooling {
    private static final String STRING_AB = "ab";
    private static final String STRING_C = "c";


    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = str2;
        String str4 = new String(str1);
        String str5 = STRING_AB + STRING_C;
        String str6 = "a" + "AbC".charAt(1) + "c";
        String str7 = str6.intern();

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
        System.out.println("str5 = " + str5);
        System.out.println("str6 = " + str6);
        System.out.println("str7 = " + str7);

        System.out.println("str1.equals(str1) = " + str1.equals(str1));
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equals(str3) = " + str1.equals(str3));
        System.out.println("str1.equals(str4) = " + str1.equals(str4));
        System.out.println("str1.equals(str5) = " + str1.equals(str5));
        System.out.println("str1.equals(str6) = " + str1.equals(str6));
        System.out.println("str1.equals(str7) = " + str1.equals(str7));

        System.out.println("(str1==str1) = " + (str1 == str1));
        System.out.println("(str1==str2) = " + (str1 == str2));
        System.out.println("(str1==str3) = " + (str1 == str3));
        System.out.println("(str1==str4) = " + (str1 == str4));
        System.out.println("(str1==str5) = " + (str1 == str5));
        System.out.println("(str1==str6) = " + (str1 == str6));
        System.out.println("(str1==str7) = " + (str1 == str7));
    }
}
