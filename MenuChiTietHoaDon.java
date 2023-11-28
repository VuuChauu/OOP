package doan;

import java.util.Scanner;

public class MenuChiTietHoaDon {
    QuanLiChiTietHoaDon danhSachChiTiet = new QuanLiChiTietHoaDon();
    Scanner sc = new Scanner(System.in);
    public void menu(){
        int luachon;
        do{
            System.out.println("--------------------------------------------");
            System.out.println("-- 1.Xem thông tin chi tiết hóa đơn       --");
            System.out.println("-- 2.Tìm chi tiết hóa đơn theo mã hóa đơn --");
            System.out.println("-- 3.Xóa chi tiết hóa đơn theo mã hóa đơn --");
            System.out.println("-- 0.Thoát                                --");
            System.out.println("--------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            luachon = sc.nextInt();
            switch (luachon){
                case 1:
                    danhSachChiTiet.hienThiChiTietHoaDon();
                    break;
                case 2:
                    danhSachChiTiet.timChiTietTheoMaHoaDon();
                    break;
                case 3:
                    danhSachChiTiet.xoaChiTietTheoMaHoaDon();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }while(luachon!= 0);
    }
}
