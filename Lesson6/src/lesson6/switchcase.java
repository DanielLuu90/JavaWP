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
public class switchcase {

    public static void ex1() {
        int a;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = nhap.nextInt();
        switch (a) {
            case 1:
                System.out.println("1 doc la One");
                break;
            case 2:
                System.out.println("2 doc la Two");
                break;
            case 3:
                System.out.println("3 doc la Three");
                break;
            case 4:
                System.out.println("4 doc la Four");
                break;
            case 5:
                System.out.println("5 doc la Five");
                break;
            case 6:
                System.out.println("6 doc la Six");
                break;
            case 7:
                System.out.println("7 doc la Seven");
                break;
            case 8:
                System.out.println("8 doc la Eight");
                break;
            case 9:
                System.out.println("9 doc la Nine");
                break;
            default:
                System.out.println("Not dictionary");
                break;
        }

    }
}
