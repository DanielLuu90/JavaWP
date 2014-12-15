/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set_getterU15;

import java.util.Scanner;
import sun.org.mozilla.javascript.internal.Token;

/**
 * Bài 1: Tạo package nhân sự, trong có 2 class là sinh viên và giảng viên Class
 * sinh viên gồm các thuộc tính: họ tên, lớp học, điểm toán, lý, hóa. Class
 * giảng viên gồm các thuộc tính: họ tên, lớp dạy, năm sinh, lương. Tạo đối
 * tượng học sinh a. Tạo đối tượng giảng viên b. Các giá trị của thuộc tính a và
 * b nhập vào từ bàn phím. Xử lý dữ liệu báo ra thông tin của a và b, tính và
 * báo ra điểm trung bình của a, xếp loại học lực, báo b có dạy a hay không! Các
 * thuộc tính để private, sử dụng phương thức getter, setter. Lập trình hướng
 * đối tượng!
 *
 * @author Dev-Android
 */
public class setter_getter {

    public static String xeploai(float dtb) {
        if (dtb >= 8.0) {
            return "Giỏi";
        } else if (dtb >= 6.5) {
            return "Khá";
        } else if (dtb >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public static boolean dayhaykhong(String sv, String gv) {
        if (sv.equals(gv)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập vào thông tin ");
        /**
         * Nhập dữ liệu
         */
        hocsinh hs = new hocsinh();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào họ tên học sinh:  ");
        hs.setHoten(nhap.next());
        System.out.println("Nhập vào lớp học của học sinh:  ");
        hs.setLophoc(nhap.next());
        System.out.println("Nhập vào Điểm toán của học sinh này: ");
        hs.setDiemToan(nhap.nextFloat());
        System.out.println("Nhập vào Điểm hóa của học sinh này: ");
        hs.setDiemHoa(nhap.nextFloat());
        System.out.println("Nhập vào Điểm Lý của học sinh này: ");
        hs.setDiemLy(nhap.nextFloat());
        /**
         * Input Giaovien
         */
        giaovien gv = new giaovien();
        System.out.println("Nhập vào họ tên giáo viên:  ");
        gv.setHoten(nhap.next());
        System.out.println("Nhập vào lớp dạy của giáo viên:  ");
        gv.setLopday(nhap.next());
        System.out.println("Nhập vào năm sinh của giáo viên này: ");
        gv.setNamsinh(nhap.nextFloat());
        System.out.println("Nhập vào mức lương của giáo viên này: ");
        gv.setLuong(nhap.nextFloat());

        float dtb = ((hs.getDiemHoa() + hs.getDiemLy() + hs.getDiemToan()) / 3);
        System.out.println("Thông tin học sinh: ");
        System.out.println("Học Sinh :" + hs.getHoten() + "\n" + "Lớp :" + hs.getLophoc() + "\n"
                + "Điểm Toán :" + hs.getDiemToan() + "\n" + "Điểm Lý :" + hs.getDiemLy() + "\n" + "Điểm Hóa :" + hs.getDiemHoa()
                + "\n" + "Điểm Trung Bình :" + dtb + "Xếp loại: " + xeploai(dtb));
        System.out.println("Thông tin giáo viên: ");
        System.out.println("Giáo Viên " + gv.getHoten() + "\n" + "Năm Sinh : " + gv.getNamsinh() + "\n" + "Dạy lớp: " + gv.getLopday() + "\n" + "Lương: " + gv.getLuong());

        if (dayhaykhong(hs.getLophoc(), gv.getLopday())) {
            System.out.println("Giáo viên " + gv.getHoten() + " dạy lớp học sinh " + hs.getHoten());
        }

    }
}
