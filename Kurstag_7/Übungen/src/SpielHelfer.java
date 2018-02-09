/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


    public  class SpielHelfer {
        public static String getBenutzereingabe(String prompt) {
            String eingabeZeile = null;
            System.out.print(prompt + " ");
            try {
                BufferedReader is = new BufferedReader(
                        new InputStreamReader(System.in));
                eingabeZeile = is.readLine();
                if (eingabeZeile.length() == 0) return null;
            }
            catch (IOException e) {
                System.out.print("IOException: " + e);
            }
            return eingabeZeile;
        }
    }




