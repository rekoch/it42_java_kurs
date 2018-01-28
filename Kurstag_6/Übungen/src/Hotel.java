/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    List<Zimmer> zimmer = new ArrayList<>();

    public Hotel(){
        zimmer.add(new Zimmer(2,false,10.0f));
        zimmer.add(new Zimmer(1,false,10.0f));
        zimmer.add(new Zimmer(2,false,15.0f));
    }

    public void reserviereZimmer(int plaetze){
        for(int i = 0; i < zimmer.size(); i++){
            if(zimmer.get(i).getPlaetze() == plaetze) {
                zimmer.get(i).setBesetzt(true);
                String name;
            }
        }
    }

    public static void startProgramm()
    {
        Scanner sc = new Scanner(System.in);

        boolean userInterface = true;
        int eingabe;
        String name = null;


        while(userInterface)
        {
            System.out.println("1: neuer Gast erfassen");
            System.out.println("2: Zimmer buchen");
            System.out.println("3: Programm beenden");

            eingabe = sc.nextInt();

            switch(eingabe)
            {
                case 1:
                    Gast gast = new Gast(name);
                    break;
            }
        }
    }
}

