/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec4_3;

import java.util.Scanner;

/**
 *
 * @author Dev-Android
 */
public class ex4_3 {

    static double a, b, c, chuvi, dientich, gocA,gocB,gocC;
    static Scanner nhap = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap vao canh a:");
        a = nhap.nextDouble();
        System.out.println("Nhap vao canh b:");
        b = nhap.nextDouble();
        System.out.println("Nhap vao canh c:");
        c = nhap.nextDouble();
        chuvi = a + b + c;
        dientich = Math.sqrt(chuvi / 2 * (chuvi / 2 - a) * (chuvi / 2 - b) * (chuvi / 2 - c));
        System.out.println("Dien tich tam giac: " + dientich);
        
        gocC = (a*a+b*b-c*c)/2*a*b; 
        System.out.println("Goc C: " + gocC);
        gocA = (b*b+c*c-a*a)/2*b*c;
        System.out.println("Goc A: " + gocA);
        gocB = (a*a+c*c-b*b)/2*a*c;
        System.out.println("Goc B: " + gocB);
    }
}
