package CongTyBangDia;

import java.util.Scanner;

public class SanPham {
    public static final Scanner s = new Scanner(System.in);
    private static int dem;
    private int maSp = ++dem;
    private String tenSp;
    private String nhaSx;
    private double gia;

    public void nhap(){
        System.out.print("Nhap ten san pham: ");
        this.tenSp = s.nextLine();
        System.out.print("Nhap nha san xuat: ");
        this.nhaSx = s.nextLine();
        System.out.print("Nhap gia ban: ");
        this.gia = s.nextDouble();
    }

    public void xuat(){
        System.out.printf("Ma san pham: %d\n", this.maSp);
        System.out.printf("Ten san pham: %s\n", this.tenSp);
        System.out.printf("Nha san xuat: %s\n", this.nhaSx);
        System.out.printf("Gia ban: %.2f vnd\n", this.gia);
    }


    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getNhaSx() {
        return nhaSx;
    }

    public void setNhaSx(String nhaSx) {
        this.nhaSx = nhaSx;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
