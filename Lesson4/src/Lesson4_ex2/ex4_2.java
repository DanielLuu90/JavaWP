/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_ex2;

import java.util.Scanner;

/**
 * 2ax+b=8c
 *
 * @author Dev-Android
 */
public class ex4_2 {

    public static void ex4(String[] arg) {
        double a, b, c;
        double x;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap A: ");
        a = nhap.nextInt();
        System.out.println("Nhap B: ");
        b = nhap.nextInt();
        System.out.println("Nhap C: ");
        c = nhap.nextInt();
        x = (8*c-b)/2*a;
        int z= (int)x;
        System.out.println("Ket qua phuong trinh la :" + z);

    }
}
