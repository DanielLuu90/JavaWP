/*
 * Bài 1: Dùng tính kế thừa khai báo 3 class:
 Class "Sinh Viên" gồm các thuộc tính: Họ tên, năm sinh, mã thẻ, tiền học phí còn nợ.
 Class "Giảng Viên" gồm các thuộc tính: Họ tên, năm sinh, mã thẻ, tiền lương hàng tháng.
 Class "Giám Đốc" gồm các thuộc tính: Họ tên, năm sinh, mã thẻ, tiền tiêu hàng tháng.

 Các thuộc tính để private, truy cập các thuộc tính sử dụng phương thức getter và setter
 Tạo 1 đối tượng giảng viên, giá trị nhập vào từ bàn phím, in thông tin ra ngoài
 màn hình console
 */
package InheritanceU16;

import java.util.Scanner;

/**
 *
 * @author Dev-Android
 */
class sinhvien extends nhansu {

    private float tienhocphi;

    public float getTienhocphi() {
        return tienhocphi;
    }

    public void setTienhocphi(float tienhocphi) {
        this.tienhocphi = tienhocphi;
    }

}

class giangvien extends nhansu {

    private long tienluong;

    public long getTienluong() {
        return tienluong;
    }

    public void setTienluong(long tienluong) {
        this.tienluong = tienluong;
    }

}

class giamdoc extends nhansu {

    private float tientieu;

    public float getTientieu() {
        return tientieu;
    }

    public void setTientieu(float tientieu) {
        this.tientieu = tientieu;
    }

}

public class main {

    public static void main(String[] args) {
        System.out.println("Nhập vào Giảng viên: ");
        Scanner scan = new Scanner(System.in);
        giangvien gv = new giangvien();
        System.out.println("Nhập tên: ");
        gv.setHoten(scan.next());
        System.out.println("Nhập mã thẻ: ");
        gv.setMathe(scan.next());
        System.out.println("Nhập năm sinh: ");
        gv.setNamsinh(scan.next());
        System.out.println("Nhập Tiền lương hàng tháng: ");
        gv.setTienluong(scan.nextLong());

        System.out.println("Thông tin giáo viên là: " + "\n" + "Họ tên: " + gv.getHoten() + "\n" + "Năm sinh: " + gv.getNamsinh() + "\n" + "Mã thẻ: " + gv.getMathe() + "\n" + "Tiền tiêu hàng tháng: " + gv.getTienluong());
    }
}
