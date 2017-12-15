package kapitel_06;

// Tiger version

import java.util.*;

public class DotCom {

   private ArrayList<String> zellorte;  
   private String name;

   public void setZellorte(ArrayList<String> orte) {
      zellorte = orte;
   }

      public void setName(String n) {
      name = n;
  }

   public String prüfDich(String benutzereingabe) { 
      String ergebnis = "Vorbei";
      int index = zellorte.indexOf(benutzereingabe);      
      if (index >= 0) {                              
          zellorte.remove(index);
         
         if (zellorte.isEmpty()) {
             ergebnis = "Versenkt";
             System.out.println("Grrr! Sie haben " + name + " versenkt : ( ");
         } else {
             ergebnis = "Treffer";
         }  // if schlie�en                       
      } // if schlie�en            
       return ergebnis;

   } // Methode schlie�en
} // Klasse schlie�en
            
     
   
   