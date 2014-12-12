/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3_ex1;

import java.util.Scanner;

/**
 *
 * @author Dev-Android
 */
public class Lesson3 {
   static int so1;
   static int so2;
   static int kq;
   static Scanner scn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Input Number 1: ");
        so1 = scn.nextInt();
        System.out.println("Input Number 2: ");
        so2 = scn.nextInt();
        kq = so1 + so2;
        System.out.println("Equals: " + kq);
    
    }
    
    
}
