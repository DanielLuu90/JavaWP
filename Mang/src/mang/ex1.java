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
public class ex1 {

    public static void mainex1() {
        int arraySosv;

        Scanner nhap = new Scanner(System.in);
        /**
         * Nhap so sinh vien
         */
        System.out.println("Nhap vao so sinh vien");
        arraySosv = nhap.nextInt();
        /**
         * Nhap ten sinh vien
         */
        String[] hotenSV = new String[arraySosv];
        int a;
        for (a = 0; a < arraySosv; a++) {
            System.out.println("Nhap vao Ho ten sinh vien thu: " + (a + 1) + ":");
            hotenSV[a] = nhap.next();
        }
        /**
         * Tim kiem Sinh vien
         */
        String findStudent;
        System.out.println("Nhap ten sinh vien can tim :");
        findStudent = nhap.next();
        boolean kt = false;
        int i;
        for (i = 0; i < arraySosv; i++) {
            if (findStudent.equals(hotenSV[i])) {
                kt = true;
                break;
            }
        }
        if (kt == true) {
            System.out.println("Sinh Vien Can Tim" + ":" + hotenSV[i] + "\n" + "O vi tri so" + (i + 1) + " trong danh sach");
        } else {
            System.out.println("Khong co sinh vien can tim");
        }

    }
}
