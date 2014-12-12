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
public class ex3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập số hàng ma trận : ");
        int hang = scn.nextInt();
        System.out.println("Nhập vào số cột ma trận : ");
        int cot = scn.nextInt();
        int matran1[][] = new int[hang][cot];
        int matran2[][] = new int[hang][cot];
        int tong2matran[][] = new int[hang][cot];
        System.out.println("Nhập ma trận 1: ");
        for (int k = 0; k < hang; k++) {
            for (int l = 0; l < cot; l++) {
                System.out.println("" + "[" + k + "]" + "[" + l + "]");
                matran1[k][l] = scn.nextInt();
            }
        }

        System.out.println("Nhập ma trận 2: ");
        for (int k = 0; k < hang; k++) {
            for (int l = 0; l < cot; l++) {
                System.out.println("" + "[" + k + "]" + "[" + l + "]");
                matran2[k][l] = scn.nextInt();
            }
        }
        System.out.println("Ma trận 1 là:  ");
        for (int k = 0; k < hang; k++) {
            for (int l = 0; l < cot; l++) {
                System.out.println(" " + matran1[k][l]);
            }
            System.out.println("");
        }

        System.out.println("Ma trận 2 là:  ");
        for (int k = 0; k < hang; k++) {
            for (int l = 0; l < cot; l++) {
                System.out.println("    " + matran2[k][l]);
            }
            System.out.println("");
        }

        System.out.println("Tổng hai ma trận là:  ");
        for (int k = 0; k < hang; k++) {
            for (int l = 0; l < cot; l++) {
                tong2matran[k][l] = matran1[k][l] + matran2[k][l];
                System.out.println("     " + tong2matran[k][l]);
            }
            System.out.println("");
        }
    }
}
