package ch.sbb.hotelreservation;


import java.util.ArrayList;

/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 * Author: Christoph Grossmann
 */

public class Zimmer {

    
    // Initialisieren der ArrayList freieZimmer und belegteZimmer.
    private ArrayList<Integer> freieZimmer = new ArrayList<Integer>();
    private ArrayList<Integer> belegteZimmer = new ArrayList<Integer>();
    
    // Methode um ein freies Zimmer hinzuzufügen
    public void addFreieZimmer(Integer roomNumber){
        int position = findFreeRoom(roomNumber);
        if(position < 0){
        freieZimmer.add(roomNumber);
        }
    }  
    // Entfernt ein freies Zimmer aus der Liste
    public void removeFreieZimmer(Integer roomNumber){
        freieZimmer.remove(roomNumber);
    } 
    
    // Methode um eine Reservation hinzuzufügen
    public void addBelegteZimmer(Integer roomNumber){
        
        belegteZimmer.add(roomNumber);
    }
    
    // Entfernt ein belegtes Zimmer aus der Liste
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
    
    // Gibt alle belegte Zimmer in der Liste auf der Konsole aus
    public void printBelegteZimmer(){
        System.out.println("Du hast " + belegteZimmer.size() + " belegte Zimmer.");
        for (int i=0; i<belegteZimmer.size(); i++){
            System.out.println("Diese währen: " + belegteZimmer.get(i));
        }
    }
    
    // Ändert ein belegtes Zimmer in der Liste und tauscht es mit einer der freien Zimmer
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
    
    // Entfernt ein belegtes Zimmer aus der Liste und fügt es der Liste für freie Zimmer hinzu
    public void removeReservation(Integer number) {
        int position = findReservedRoom(number);
        if(position >= 0){
            belegteZimmer.remove(position);
            freieZimmer.add(number);
        } else {
            System.out.println("Bitte gib eine reservierte Zimmernummer an.");
        }
    }
        
    // Sucht ob das gesuchte Zimmer in der Liste für belegte Zimmer vorhanden ist
    private int findReservedRoom(Integer searchRoom){
        
        return belegteZimmer.indexOf(searchRoom);
    }
    
    // Sucht ob das gesuchte Zimmer in der Liste für freie Zimmer vorhanden ist
    private int findFreeRoom(Integer searchRoom){
        
        return freieZimmer.indexOf(searchRoom);
    }
}
