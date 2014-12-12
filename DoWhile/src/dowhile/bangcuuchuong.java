/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

/**
 *
 * @author Dev-Android
 */
public class bangcuuchuong {

    public static void bangcuuchuong() {

        for (int i = 2; i < 10; i++) {
            System.out.println("Bang cuu chuong" + i);
            for (int j = 1; j < 10; j++) {
                int result = i * j;
                System.out.println(i + "x" + j + "=" + result);
            }
        }

    }
}
