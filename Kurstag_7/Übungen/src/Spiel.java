/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */


import java.util.Scanner;

public class Spiel {
    public static void main(String[] args){

        System.out.println("Geben sie eine Zahl ein");

        Scanner sc = new Scanner(System.in);
        String tipp = sc.next();

        DotCom dotCom = new DotCom();
        dotCom.prüfDich(tipp);
    }
}
