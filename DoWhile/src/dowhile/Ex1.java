/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author Dev-Android
 */
public class Ex1 {

    public static void ex1() {
        int a;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ban nhan muon in ra ");
        a = nhap.nextInt();
        for (int i = 0; i < 10; i++) {
            int result = a * i;
            System.out.println("Ket qua: " + a + "x" + i + "=" + result);
        }
    }
}
