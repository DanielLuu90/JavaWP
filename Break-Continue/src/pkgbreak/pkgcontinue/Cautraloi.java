/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak.pkgcontinue;

import java.util.Scanner;

/**
 *
 * @author Dev-Android
 */
public class Cautraloi {
    private String name[];
    private int numberStudent;
 
    public void Input() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhap so sinh vien : ");
        numberStudent = inp.nextInt();
        inp.nextLine();
        System.out.println("Nhap ten cac sinh vien : ");
        name = new String[numberStudent];
        for (int i = 0; i < numberStudent; i++) {
            System.out.println("Sinh vien thu : " + (i + 1));
            name[i] = inp.nextLine();
        }
    }
 
    public void showList() {
        for (int i = 0; i < numberStudent; i++) {
            System.out.println(i + 1 + "." + name[i]);
        }
    }
 
    public void Sapxep() {
        for (int i = numberStudent; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }
    }
 
    public int Search(String hoten) {
 
        int d = 0, c = numberStudent - 1, g = -1;
        while (d <= c) {
            g = (d + c) / 2;
            if (name[g].equals(hoten)) {
                return g + 1;
            }
            if (hoten.compareTo(name[g]) > 0) {
                c = g - 1;
            } else {
                d = g + 1;
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
        Cautraloi st1 = new Cautraloi();
        st1.Input();
        System.out.println("Danh sach sinh vien da nhap : ");
        st1.showList();
        st1.Sapxep();
        System.out.println("Danh sach sau khi sap xep lai la : ");
        st1.showList();
        System.out.println("Nhap ten sinh vien can tim : ");
        Scanner inp = new Scanner(System.in);
        String hoten = inp.nextLine();
        int k = st1.Search(hoten);
        if (k != -1) {
            System.out.println("So thu tu cua sinh vien do trong danh sach la : ");
            System.out.println(k);
        } else {
            System.out.println("Ten sinh vien vua nhap khong co trong danh sach");
        }
    }
}
