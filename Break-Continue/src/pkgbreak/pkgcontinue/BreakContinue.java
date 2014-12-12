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
public class BreakContinue {

    /**
     * @Nhập 1 danh sách họ tên sinh viên 1 lớp học vào 1 mảng n phần tử. Sắp
     * xếp theo thứ tự a, b, c ... rồi dùng thuật toán tìm kiếm nhị phân, tìm
     * kiếm chính xác tên sinh viên vừa nhập và in ra màn hình số thứ tự của
     * sinh viên đó!
     */
    public static void main(String[] args) {
        int siso;
        String tencantim;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập Sĩ Số lớp học: ");
        siso = scan.nextInt();
        String[] nameStudent = new String[siso];
        for (int i = 0; i < siso; i++) {
            System.out.println("Nhập họ tên sinh viên thứ" + (i + 1) + ":");
            nameStudent[i] = scan.next();
        }
        System.out.println("Nhập tên cần tìm: ");
        tencantim = scan.next();
        for (int i = 0; i < siso; i++) {
            if (tencantim.equals(nameStudent[i])) {
                System.out.println("Tên cần tìm là :" +tencantim +"Số thứ tự của Sinh Viên đó là: "+ (i+1));
                
            } else{
                System.out.println("Không có tên sinh viên cần tìm");
                break;
            }
 
        }
        
    }

}
