/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodU14;

import java.util.Scanner;

/**
 *
 * @author Dev-Android
 */
public class hanghoa {

    public String tenHanghoa;
    public String maHanghoa;
    public long giaHanghoa;
    public int soLuong;
    public int time;
    Scanner nhap = new Scanner(System.in);
    
    public void Input(){
        System.out.println("Tên hàng hóa: ");
        tenHanghoa = nhap.next();
        System.out.println("Mã hàng hóa:  ");
        maHanghoa = nhap.next();
        System.out.println("Số lượng hàng hóa: ");
        soLuong = nhap.nextInt();
        System.out.println("Đơn giá: ");
        giaHanghoa = nhap.nextLong();
        System.out.println("Thời gian mua:  ");
        time = nhap.nextInt();
    }

    public Long tinhTongtien(Long dg, int sL, int time) {
        if ((8< time) && (time< 17)) {
            return (long) (dg*sL-dg*sL*0.05);
        } else{
            return  dg*sL;
        }
           
    }
      public void showHoadon(){
          System.out.println("Tên Hàng hóa  "+"Mã Hàng hóa   "+"Đơn giá    "+"  Số lượng   "+"Thời gian mua");
          System.out.print(  tenHanghoa+"\t\t"+maHanghoa+"\t\t"+giaHanghoa+"\t\t"+soLuong+"\t\t"+ time+"\t  ");
    }
    
}