
import ch.grossmann.timbuchalka.arraylist.ArrayListUdemy;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class Hotel {
    
    private static Scanner scanner = new Scanner(System.in);
    
    // Ein Objekt der ArrayListUdemy erstellen
    private static Zimmer zimmer= new Zimmer();
    
        
    
    
    
    
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    zimmer.printZimmerList();
                    break;
                case 2:
                    addItem();
                    break; 
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;                    
            }
        }
        
    }
    
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item in the list.");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
        
    }
    
    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryListItem(scanner.nextLine());
    }
    
    public static void modifyItem(){
        System.out.print("Current item name: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryListItem(oldItem, newItem);
        
    }
    
        public static void removeItem(){
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName); 
        
    }
        
        public static void searchForItem(){
        System.out.print("Enter item number: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.print("Found " + searchItem + " in our grocery list.");
        }else{
            System.out.print(searchItem + " is not in the shopping list.");
        }
        
    }

}
