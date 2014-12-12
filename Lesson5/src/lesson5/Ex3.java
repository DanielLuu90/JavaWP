/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

import java.util.Scanner;

/**
 * ax^2 + bx +c =0
 *
 * @author Dev-Android
 */
public class Ex3 {

    public static void main() {
        double a, b, c, delta, x1, x2;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = nhap.nextDouble();
        System.out.println("Nhap vao so b: ");
        b = nhap.nextDouble();
        System.out.println("Nhap vao so c: ");
        c = nhap.nextDouble();
        delta = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Phuong trinh khong phai phuong trinh bac 2: " + "\n"
                    + "phuong trinh co nghiem la: " + -c / b);
        } else if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem duy nhat la: " + -b / 2 * a);
        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / 2 * a;
            x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("Phuong trinh co hai nghiem: " + "\n"
                    + "Nghiem thu nhat :" + "\n" + x1 + "\n"
                    + "Nghiem thu hai  :" + x2);
        }

    }
}
