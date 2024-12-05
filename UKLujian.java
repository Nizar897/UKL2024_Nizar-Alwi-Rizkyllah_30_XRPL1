/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uklujian;

import java.util.Scanner;

/**
 *
 * @author NIZAR ALWI RIZKYLLAH
 */
public class UKLujian {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan bilangan: ");
        int number = scanner.nextInt(); 

        
        if (Prima(number)) {
            System.out.println(number + " adalah bilangan prima.");
         } else {
            System.out.println(number + " bukan bilangan prima.");
        }
       
    }

    
    public static boolean Prima(int number) {
        
        if (number < 2) {
            return false;
        }
        
        
        for (int i = 2; i <= (number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;

    }
}
