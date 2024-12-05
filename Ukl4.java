/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl4;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author NIZAR ALWI RIZKYLLAH
 */
public class Ukl4 {

    public static void main(String[] args) {
       


        
        int[] array = {3, 3, 3, 5, 5, 7, 5};

        
        HashMap<Integer, Integer> frekuensiMap = new HashMap<>();

        for (int num : array) {
            frekuensiMap.put(num, frekuensiMap.getOrDefault(num, 0) + 1);
        }

        
        int elementerbanyak = array[0];
        int berisi = 0;

        for (Map.Entry<Integer, Integer> entry : frekuensiMap.entrySet()) {
            if (entry.getValue() > berisi) {
                elementerbanyak = entry.getKey();
                berisi = entry.getValue();
            }
        }

        
        System.out.println("Elemen yang paling sering muncul adalah " 
                            + elementerbanyak 
                            + " sebanyak " 
                            + berisi + " kali.");
        
        
      
       

        
    }
}

    


    

