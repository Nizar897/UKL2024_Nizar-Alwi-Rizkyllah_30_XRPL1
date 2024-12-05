/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2;
 import java.util.Scanner;
/**
 *
 * @author NIZAR ALWI RIZKYLLAH
 */
public class UKL2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola (r): ");
        double jarijari = scanner.nextDouble();

        
        double permukaan = permukaanlingkaran(jarijari);

        System.out.println("Luas permukaan bola dengan jari-jari " + jarijari + " adalah: " + permukaan);

        
    }

   
    public static double permukaanlingkaran(double r) {
        final double PI = Math.PI; 
        return 4 * PI * Math.pow(r, 2); 
    }
}




  
