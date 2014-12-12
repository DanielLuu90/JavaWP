/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

import java.util.Scanner;

/**
 *
 * @author Dev-Android
 */
public class Ex1 {

    public static void ex1() {
        int a;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = nhap.nextInt();
        if (a % 5 == 0) {
            System.out.println("Chia het cho 5");
        } else {
            System.out.println("Khong chia het cho 5");
            System.out.println("Phan nguyen sau khi chia: " + a / 5);
            System.out.println("Phan du sau khi chia: " + a % 5);
        }

    }
}
