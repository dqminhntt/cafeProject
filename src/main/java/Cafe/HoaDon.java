package Cafe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HoaDon {
    public static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    public static final Scanner s = new Scanner(System.in);
    private static int dem;
    private int maHoaDon = ++dem;
    private String maBan;
    private LocalDateTime ngayXuat;
    private double tongTien;

    public void nhapMaBan(String mb){
        this.maBan = mb;
    }

//    public double tinhTongTien(){
//        this.dssp.forEach(sp -> this.tongTien += sp.getGiaBan());
//        return this.tongTien;
//    }

//    public void nhapNgay() throws ParseException {
//        System.out.print("Nhap ngay sinh: ");
//        this.ngayXuat = (F.parse(s.nextLine()));
//    }

    public HoaDon(String mb, double tt){
        this.maBan = mb;
        LocalDateTime now = LocalDateTime.now();
        this.ngayXuat = now;
        this.tongTien = tt;
    }

//    public void nhapHoaDon(String mb) throws ParseException {
//        this.nhapMaBan(mb);
//        this.nhapNgay();
//    }

    public void themSanPham(int soLuong){

    }

    public void xuatHoaDon(){
        System.out.printf("Ma hoa don: %d\n",this.maHoaDon);
        System.out.printf("Ngay xuat: %s\n", this.ngayXuat);
        System.out.printf("Tong tien: %2f\n", this.tongTien);
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
