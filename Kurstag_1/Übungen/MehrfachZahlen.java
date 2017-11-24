/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2017.
 */

package Lektion01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MehrfachZahlen {

    public static void main(String[] args) throws IOException {
        //long[] input = {1, 42, 62, 23, 49, 42, 42, 23, 23, 5};
        long[] input = new long[100];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        List output = new ArrayList<>();

        System.out.println("Bitte ein Zahl eingeben:");
        String zahl = r.readLine();
        for (int l = 0; 0 < input.length; l++) {
            try {
                System.out.println("Bitte ein Zahl eingeben:");
                zahl = r.readLine();
                input[l] = Long.parseLong(zahl);
            } catch (NumberFormatException ex) {
                for (int i = 0; i < input.length; i++) {
                    for (int o = input.length - 1; o > i + 1; o--)
                        if (input[i] == input[o]) {
                            if (!output.contains(input[i])) {
                                output.add(input[i]);
                            }
                        }
                }
            }


            Collections.sort(output);

            for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i) + " ");
            }
        }
    }
}
