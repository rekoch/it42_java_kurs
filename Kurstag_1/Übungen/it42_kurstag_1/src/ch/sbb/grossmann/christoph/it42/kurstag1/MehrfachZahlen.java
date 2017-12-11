/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.sbb.grossmann.christoph.it42.kurstag1;

import java.util.Arrays;

/**
 *
 * @author ch.grossmann
 */
public class MehrfachZahlen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long[] input = {1, 42, 62, 23, 49, 42, 42, 23, 23, 5};
        // Zahlen im Array mit einem boolean vergleichen und doppelte in 
        // einem 2. Array speichern 

        long[] vergleicher = {0,0,0,0,0,0,0,0,0,0,0,0};
        int l = 0;
        
       for(int i = 0; i < input.length ; i++) {
           
           for(int k = 0; k < input.length; k++){
               
               if(input[i]==input[k] && i!=k){
                   
                   vergleicher[l] = input[i];
                   l++;
               }
               
           }
           
       }
         System.out.println(Arrays.toString(vergleicher));  
            
        }
    }
    
