/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak.pkgcontinue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    String nameStudent;

    public static void main(String[] args) {
        Cautraloi.main(args);
        int siso;
        String tencantim;

        Scanner scan = new Scanner(System.in);
        ArrayList<BreakContinue> danhsach = new ArrayList();
        System.out.println("Nhập Sĩ Số lớp học: ");
        siso = scan.nextInt();

        for (int i = 0; i < siso; i++) {
            scan.nextLine();
            BreakContinue bK = new BreakContinue();
            System.out.println("Nhập họ tên sinh viên thứ" + (i + 1) + ":");
            bK.nameStudent = scan.next();
            danhsach.add(bK);
        }

        Collections.sort(danhsach, new Comparator<BreakContinue>() {
            @Override
            public int compare(BreakContinue sv1, BreakContinue sv2) {
                return (sv1.nameStudent.compareTo(sv2.nameStudent));
            }
        });
        System.out.println("Danh sách sắp xếp theo alphabet là: ");
        for (int i = 0; i < danhsach.size(); i++) {
            System.out.println("Họ Tên Sinh Viên" + (i + 1) + ":" + danhsach.get(i).nameStudent);
        }
        System.out.println("Nhập tên cần tìm: ");
        tencantim = scan.next();
        for (int i = 0; i < danhsach.size(); i++) {
            if (tencantim.equals(danhsach.get(i).nameStudent)) {
                System.out.println("Sinh viên cần tìm là : " + danhsach.get(i).nameStudent);
              break;
            } else {
                System.out.println("Không có sinh viên cần tìm.");
              continue; 
            }
        }

    }

}
