package doan;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuNhanVien menuNhanVien = new MenuNhanVien();
        MenuHoaDon menuHoaDon = new MenuHoaDon();
        MenuChiTietHoaDon menuChiTietHoaDon = new MenuChiTietHoaDon();
        int luachon;
        do{
            System.out.println("---------------------------------");
            System.out.println("--  1.Quản lý nhân viên        --");
            System.out.println("--  2.Quản lý hóa đơn          --");
            System.out.println("--  3.Quản lý chi tiết hóa đơn --");
            System.out.println("--  0.Thoát                   --");
            System.out.println("---------------------------------");
            System.out.print("Nhập lựa chọn: ");
            luachon = sc.nextInt();
            switch (luachon){
                case 1:
                    menuNhanVien.menu();
                    break;
                case 2:
                    menuHoaDon.menu();
                    break;
                case 3:
                    menuChiTietHoaDon.menu();
                    break;
            }
        }while (luachon != 0);
    }
}
