package ch.sbb.hotelreservation;


import java.util.ArrayList;

/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class Zimmer {

    
    // Initialisieren der ArrayList freieZimmer und belegteZimmer.
    private ArrayList<Integer> freieZimmer = new ArrayList<Integer>();
    private ArrayList<Integer> belegteZimmer = new ArrayList<Integer>();
    
    // Methode um ein freies Zimmer hinzuzufügen
    public void addFreieZimmer(Integer roomNumber){
        freieZimmer.add(roomNumber);
    }  
    
      public void removeFreieZimmer(Integer roomNumber){
        freieZimmer.remove(roomNumber);
    } 
    
    // Methode um eine Reservation hinzuzufügen
    public void addBelegteZimmer(Integer roomNumber){
        
        belegteZimmer.add(roomNumber);
    }
    
    public void removeBelegteZimmer(Integer roomNumber){
        
        belegteZimmer.remove(roomNumber);
    }
    
    // Methode um die Zimmer auf die Konsole auszugeben
    public void printFreieZimmer(){
        System.out.println("Du hast " + freieZimmer.size() + " freie Zimmer.");
        for (int i=0; i<freieZimmer.size(); i++){
            System.out.println("Diese währen: " + freieZimmer.get(i));
        }

    }
    
    public void printBelegteZimmer(){
        System.out.println("Du hast " + belegteZimmer.size() + " belegte Zimmer.");
        for (int i=0; i<belegteZimmer.size(); i++){
            System.out.println("Diese währen: " + belegteZimmer.get(i));
        }
    }
    
    public void modifyReservationRoom(Integer currentRoomnumber, Integer newRoomnumber){
        int position = findReservedRoom(currentRoomnumber);
        if(position >= 0){
            belegteZimmer.set(position, newRoomnumber);
            freieZimmer.add(currentRoomnumber);
            freieZimmer.remove(newRoomnumber);
        } else {
            System.out.println("Bitte gib eine reservierte Zimmernummer an.");
        }
    }
    
    public void removeReservation(Integer number) {
        int position = findReservedRoom(number);
        if(position >= 0){
            belegteZimmer.remove(position);
            freieZimmer.add(number);
        } else {
            System.out.println("Bitte gib eine reservierte Zimmernummer an.");
        }
    }
        
    // Methode um die ArrayList nach etwas zu durchsuchen
    private int findReservedRoom(Integer searchRoom){
        
        return belegteZimmer.indexOf(searchRoom);
    }
    
    private int findFreeRoom(Integer searchRoom){
        
        return freieZimmer.indexOf(searchRoom);
    }
}
