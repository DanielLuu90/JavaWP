/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author Dev-Android
 */
public class ex2 {

    public static void EX2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, sn, tg;
        System.out.println("Nhập số phần tử muốn sắp xếp: ");
        sn = scanner.nextInt();
        int[] n = new int[sn];
        for (i = 0; i < sn; i++) {
            System.out.println("Nhập phần tử thứ :" + (i + 1));
            n[i] = scanner.nextInt();
        }
        for (i = 0; i < sn; i++) {
            for (j = i + 1; j < sn; j++) {
                if (n[i] > n[j]) {
                    tg = n[i];
                    n[i] = n[j];
                    n[j] = tg;
                }
            }
            System.out.println("Mảng sau khi sắp xếp là: ");
            System.out.println(n[i]);
        }

    }
}
