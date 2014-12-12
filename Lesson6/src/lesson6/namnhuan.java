/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

import java.util.Scanner;

/**
 *
 * @author Dev-Android
 */
public class namnhuan {

    public static void namnhuan() {
        int nam;
        int thang;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap Thang: ");
        thang = nhap.nextInt();
        System.out.println("Nhap Nam: ");
        nam = nhap.nextInt();

        if (nam < 0) {
            System.out.println("Ban da nhap sai nam");
        } else if (thang < 0 && thang > 12) {
            System.out.println("Ban da nhap sai thang");
        } else {
            if ((nam % 4 == 0 && nam % 100 == 0) || (nam % 400 == 0)) {
                System.out.println("Nam nay la nam nhuan ");
            } else {
                System.out.println("Nam nay la nam khong nhuan");
            }

        }

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Nhung thang " + thang + " la thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Nhung thang " + thang + " la thang co 30 ngay");
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 == 0) || (nam % 400 == 0)) {
                    System.out.println("Thang 2 nam"+nam+"  co 29 ngay");
                } else {
                    System.out.println("Thang 2 nam" +nam+" co 28 ngay");
                }
            break;
        }

    }
}
