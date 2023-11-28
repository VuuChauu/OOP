package doan;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class HoaDon {
    private int maHoaDon;
    private Date ngayLap;
    private int maNhanVien;
    private int maKhachHang;
    private float tongTien;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public HoaDon() {
        maHoaDon = 0;
        maNhanVien = 0;
        maKhachHang = 0;
        ngayLap = new Date();
        tongTien = 0.0F;
    }

    public HoaDon(int maHoaDon, int maNhanVien, float tongTien, NhanVien nhanvien, int maKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = new Date();
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.tongTien = tongTien;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }


    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hóa đơn: ");
        maHoaDon = sc.nextInt();
        System.out.print("Nhập mã nhân viên: ");
        maNhanVien = sc.nextInt();
        System.out.print("Nhập mã khách hàng: ");
        maKhachHang = sc.nextInt();
    }

    public void Xuat() {
        HoaDon hd = new HoaDon();
        System.out.println("-------------------------------");
        System.out.println("Mã hóa đơn: " + hd.maHoaDon);
        System.out.println("Ngày lập hóa đơn: " + dateFormat.format(ngayLap));
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Mã khách hàng mua: " + maKhachHang);
        System.out.println("Tổng tiền bán: " + tongTien);
    }
}

