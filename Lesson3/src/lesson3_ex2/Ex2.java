/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3_ex2;

import java.util.Scanner;

/**
 *TrucLH
 */

public class Ex2 {
    static double chuvi, dientich;
    static int r;
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] arg){
        System.out.println("Nhap ban kinh: ");
        r = scn.nextInt();
        dientich = r*r*Math.PI;
        System.out.println("S = "+dientich);
        chuvi = r*2*Math.PI;
        System.out.println("P = "+chuvi);
        
    }
    
    
}
