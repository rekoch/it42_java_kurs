
import java.util.ArrayList;
import java.util.Date;

/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class Zimmer {
    private int zimmernummer;
    private double preis;
    private int plaetze;
    private boolean reserviert;
    
    
    
    // Initialisieren der ArrayList freieZimmer und belegteZimmer.
    private ArrayList<Integer> freieZimmer = new ArrayList<Integer>();
    private ArrayList<Integer> belegteZimmer = new ArrayList<Integer>();
    
    // Methode um eine Reservation hinzuzufügen
    public void addReservation(Integer item){
        belegteZimmer.add(item);
    }
    
    // Methode um die Zimmer auf die Konsole auszugeben
    public void printZimmerList(){
        System.out.println("You have " + freieZimmer.size() + " rooms vacancy.");
        for (int i=0; i<freieZimmer.size(); i++){
            System.out.println((i+1) + ". " + freieZimmer.get(i));
        }
        System.out.println("You have " + belegteZimmer.size() + " rooms in your reservation list.");
        for (int i=0; i<belegteZimmer.size(); i++){
            System.out.println((i+1) + ". " + belegteZimmer.get(i));
        }
    }
    
    public void modifyReservationList(Integer currentRoomnumber, Integer newRoomnumber){
        int position = findItem(currentRoomnumber);
        if(position >= 0){
            modifyReservationList(position, newRoomnumber);
        }
    }
    
    // Methode um eine bestimmte Position in der ArrayList zu verändern
    private void modifyReservationList(int frei, int belegt, Integer newRoomnumber){
        freieZimmer.remove(frei);
        belegteZimmer.set(belegt, newRoomnumber);
        System.out.println("Room " + (belegt+1) + " is now reserved.");
    }
    
    public void removeReservation(Integer number) {
        int position = findItem(number);
        if(position >= 0){
            removeReservation(position);
        }
    }
    
    // Methode um eine bestimmte Position in der ArrayList zu löschen
    private void removeReservation(int position) {
        
        freieZimmer.add()
        belegteZimmer.remove(position);
    }
    
    
    public boolean onFile(Integer searchReservation){
    int position = findItem(searchReservation);
    if(position >= 0){
        return true;
    }
        
    return false;
    }
        
    // Methode um die ArrayList nach etwas zu durchsuchen
    private int findItem(Integer searchRoom){
        return groceryList.indexOf(searchItem);
    }
}
