/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

import java.util.Scanner;
import sun.org.mozilla.javascript.internal.Token;

/**
 *
 * @author Dev-Android
 */
public class Ex2 {

    public static void ex2() {
        double a, b, c;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao canh a:  ");
        a = nhap.nextDouble();
        System.out.println("Nhap vao canh b:  ");
        b = nhap.nextDouble();
        System.out.println("Nhap vao canh c:  ");
        c = nhap.nextDouble();
        if ((a * a + b * b - c * c == 0)) {
            System.out.println("Tam giac la tam giac vuong." + "\n" + "Canh a va"
                    + " canh b la canh goc vuong, Canh c la canh huyen");
        } else if (a * a + c * c - b * b == 0) {
            System.out.println("Tam giac la tam giac vuong." + "\n" + "Canh a va"
                    + " canh c la canh goc vuong, Canh b la canh huyen");
        } else if (c * c + b * b - a * a == 0) {
            System.out.println("Tam giac la tam giac vuong." + "\n" + "Canh c va"
                    + " canh b la canh goc vuong, Canh a la canh huyen");
        } else {
            System.out.println("Tam giac khong la tam giac vuong.");
        }
    }

}
