/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */



import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        String username;
        int useralter;
        Scanner user_input_scanner = new Scanner(System.in);

        System.out.println("Wie heisst du?");
        username = user_input_scanner.next();

        System.out.println("Hallo " + username);

        System.out.println("Wie alt bist du?");
        useralter = Integer.parseInt(user_input_scanner.next());

        if(useralter < 18)
        {
            System.out.println("Hallo " + username + ", du bist noch nicht erwachsen");
        }
        else if(useralter >= 18 && useralter <= 60)
        {
            System.out.println("Hallo " + username + ", du bist Erwachsen");
        }
        else if(useralter > 60)
        {
            System.out.println("Hallo " + username + ", du bist ein aber alt ;)");
        }

    }
}