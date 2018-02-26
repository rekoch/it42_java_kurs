package Kurstag_6.Übungen.it42_kurstag_6.src.ch.sbb.hotelreservation;




import java.util.Scanner;

/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 * Author: Christoph Grossmann
 */

public class Hotel {
    
    private static Scanner scanner = new Scanner(System.in);
    
    // Ein Objekt erstellen
    private static Zimmer zimmer= new Zimmer();


    public static void main(String[] args) {
        
        
        boolean quitRoomInit = false;
        int choiceRoomInit = 0;
        printRoomInstructions();
        while(!quitRoomInit){
            System.out.println("Wähle deine Handlung: ");
            choiceRoomInit = scanner.nextInt();
            scanner.nextLine();
            
            switch(choiceRoomInit){
                case 0:
                    // Um die Liste der freien Zimmer zu erstellen
                    initRoomnumbers();
                    break;
                    
                case 1:
                    quitRoomInit = true;
                    break;                    
            }
        }
        
        
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Wähle deine Handlung: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 0:
                    // gib die Auswahl wieder
                    printInstructions();
                    break;
                case 1:
                    // zeige freie Zimmer
                    zimmer.printFreieZimmer();
                    break;
                case 2:
                    // zeige belegte Zimmer
                    zimmer.printBelegteZimmer();
                    break; 
                case 3:
                    // füge Reservation hinzu
                    addReservation();
                    break;
                case 4:
                    // entferne reservation
                    removeReservation();
                    break;
                case 5:
                    // ändere reservation
                    modifyReservation();
                    break;
                case 6:
                    quit = true;
                    break;                    
            }
        }
        
    }
    
 
    // Gibt die Optionen für das erstellen der Zimmerliste
    public static void printRoomInstructions(){
        System.out.println("\nWähle eine Option ");
        System.out.println("\t 0 - Gib eine Zimmernummer ein.");
        System.out.println("\t 1 - Alle Zimmer eingegeben, weiter zur Reservation.");

    }
    
    // 
    private static void initRoomnumbers(){
        System.out.print("Gib die freien Zimmernummer ein: ");
        int roomnumber = scanner.nextInt();
        zimmer.addFreieZimmer(roomnumber);
    }    
    
    // Gibt die Optionen für das managen der Reservationen
    public static void printInstructions(){
        System.out.println("\nWähle eine Option ");
        System.out.println("\t 0 - Zeigt die Optionen.");
        System.out.println("\t 1 - Zeigt alle freien Zimmer.");
        System.out.println("\t 2 - Zeigt alle belegten Zimmer.");
        System.out.println("\t 3 - Eine Reservation hinzufügen.");
        System.out.println("\t 4 - Eine Reservation entfernen.");
        System.out.println("\t 5 - Ein reserviertes Zimmer ändern.");
        System.out.println("\t 6 - Das Programm beenden.");
        
    }
    
 
    public static void addReservation(){
        System.out.print("Gib die zu reservierende Zimmernummer ein: ");
        int addRes = scanner.nextInt();
        zimmer.addBelegteZimmer(addRes);
        zimmer.removeFreieZimmer(addRes);
    }
    
    public static void modifyReservation(){
        System.out.print("Gib die zu ändernde reservierte Zimmernummer an: ");
        Integer oldRoom = scanner.nextInt();
        System.out.print("Gib die neue Zimmernummer an: ");
        Integer newRoom = scanner.nextInt();
        zimmer.modifyReservationRoom(oldRoom, newRoom);
        
    }
    
        public static void removeReservation(){
        System.out.print("Gib die zu entfernende reservierte Zimmernummer an: ");
        Integer remRes = scanner.nextInt();
        zimmer.removeReservation(remRes); 
        
    }


}
