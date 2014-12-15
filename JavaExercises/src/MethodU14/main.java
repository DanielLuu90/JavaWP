/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodU14;

/**
 *
 * @author Dev-Android
 */
public class main {
    
    public static void main(String [] args){
       hanghoa donHang = new hanghoa();
       System.out.println("Nhập thông tin: ");
       donHang.Input();
       donHang.showHoadon();
       long total = donHang.tinhTongtien(donHang.giaHanghoa,donHang.soLuong, donHang.time);
       System.out.println("Số tiền phải trả: "+total);
    }
    
    
        
    
}
