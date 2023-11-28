package doan;

import java.util.Scanner;

public class ChiTietHoaDon {
    private int maHoaDon;
    private int maSanPham;
    private int soLuongMua;
    private float donGia;
    private float thanhTien;
    Scanner sc = new Scanner(System.in);
    public ChiTietHoaDon(){
        maHoaDon = 0;
        maSanPham = 0;
        soLuongMua = 0;
        donGia = 0.0F;
        thanhTien = 0.0F;
    }
    public ChiTietHoaDon(int maHoaDon, int maSanPham, int soLuongMua, int donGia, int thanhTien){
        this.maHoaDon = maHoaDon;
        this.maSanPham = maSanPham;
        this.soLuongMua = soLuongMua;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    public float getThanhTien() {
        return donGia * soLuongMua;
    }
    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }
    public void Nhap(){
        System.out.print("Nhập mã sản phẩm: ");
        maSanPham = sc.nextInt();
        System.out.print("Nhập số lượng mua: ");
        soLuongMua = sc.nextInt();
        HoaDon hoaDon = new HoaDon();
        setMaHoaDon(hoaDon.getMaHoaDon());
    }
    public void Xuat(){
        System.out.println("------------------------");
        System.out.println("Mã hóa đơn: " + getMaHoaDon());
        System.out.println("Mã sản phẩm: " + maSanPham);
        System.out.println("Số lượng mua " + soLuongMua);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Thành tiền: " + thanhTien);
    }
}
