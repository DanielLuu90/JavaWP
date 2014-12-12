/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import Lesson4_ex2.ex4_2;
import ec4_3.ex4_3;

/**
 *
 * @author Dev-Android
 */
public class Lesson4 {

    static int a = 5;
    static int b = 8;
    static int c = 13;
    static int ba = 3;
    static int hai = 2;
    static int du, nguyen;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        du = a % ba;
        System.out.println("Phan du cua a sau khi chia cho ba :" + du);
        du = b % ba;
        System.out.println("Phan du cua b sau khi chia cho ba :" + du);
        du = c % ba;
        System.out.println("Phan du cua c sau khi chia cho ba :" + du);

        nguyen = a / hai;
        a++;
        System.out.println("Sau khi tang a len 1 gia tri: " + a);
        System.out.println("Phan nguyen cua a sau khi chia cho hai :" + nguyen);
        nguyen = b / hai;
        b++;
        System.out.println("Sau khi tang b len 1 gia tri: " + b);
        System.out.println("Phan nguyen cua b sau khi chia cho hai :" + nguyen);
        nguyen = c / hai;
        c++;
        System.out.println("Sau khi tang b len 1 gia tri: " + c);
        System.out.println("Phan nguyen cua b sau khi chia cho hai :" + nguyen);
        ex4_2.ex4(args);
        ex4_3.main(args);
    }

}
