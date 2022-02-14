package Cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public abstract class SanPham {
    public static final Scanner s = new Scanner(System.in);
    private static int dem;
    private int maSanPham = ++dem;
    private String ten;
    private double giaBan;
    private boolean tinhTrang;
    private List<ThoiDiemBan> thoiDiemBan;

    public void nhapTinhTrang(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("| Tinh trang san pham");
            System.out.println("| 1. Con");
            System.out.println("| 2. Het");
            System.out.println("| 3. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    this.tinhTrang = true;
                    break;
                case 2:
                    this.tinhTrang = false;
                    break;
                case 3:
                    done = true;
            }
        }while (!done);
    }

    public void nhapSanPham(){
        System.out.print("Nhap ten san pham: ");
        s.nextLine();
        this.ten = s.nextLine();
        System.out.print("Nhap gia ban: ");
        this.giaBan = parseDouble(s.nextLine()) ;
        this.nhapTinhTrang();
    }

    public void themThoiDiemBan(){
        int choice;
        boolean done = false;
        this.thoiDiemBan = new ArrayList<>();
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Them thoi diem ban cho san pham");
            System.out.println("| 1. Sang");
            System.out.println("| 2. Trua");
            System.out.println("| 3. Chieu");
            System.out.println("| 4. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    if (this.thoiDiemBan.contains(choice))
                        break;
                    else {
                        this.thoiDiemBan.add(new Sang());
                        break;
                    }
                case 2:
                    if (this.thoiDiemBan.contains(choice))
                        break;
                    else {
                        this.thoiDiemBan.add(new Trua());
                        break;
                    }
                case 3:
                    if (this.thoiDiemBan.contains(choice))
                        break;
                    else {
                        this.thoiDiemBan.add(new Chieu());
                        break;
                    }
                case 4:
                    done = true;
            }
        }while (!done);
    }

    public void capNhatThemThoiDiemBan(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Them thoi diem ban cho san pham");
            System.out.println("| 1. Sang");
            System.out.println("| 2. Trua");
            System.out.println("| 3. Chieu");
            System.out.println("| 4. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    if (this.thoiDiemBan.contains(choice))
                        break;
                    else {
                        this.thoiDiemBan.add(new Sang());
                        break;
                    }
                case 2:
                    if (this.thoiDiemBan.contains(choice))
                        break;
                    else {
                        this.thoiDiemBan.add(new Trua());
                        break;
                    }
                case 3:
                    if (this.thoiDiemBan.contains(choice))
                        break;
                    else {
                        this.thoiDiemBan.add(new Chieu());
                        break;
                    }
                case 4:
                    done = true;
            }
        }while (!done);
    }

    public void xoaThoiDiemBan(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Xoa thoi diem ban");
            System.out.println("| 1. Sang");
            System.out.println("| 2. Trua");
            System.out.println("| 3. Chieu");
            System.out.println("| 4. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    if (this.thoiDiemBan.contains(choice))
                        this.thoiDiemBan.remove(choice);
                    else {
                        break;
                    }
                case 2:
                    if (this.thoiDiemBan.contains(choice))
                        this.thoiDiemBan.remove(choice);
                    else {
                        break;
                    }
                case 3:
                    if (this.thoiDiemBan.contains(choice))
                        this.thoiDiemBan.remove(choice);
                    else {
                        break;
                    }
                case 4:
                    done = true;
            }
        }while (!done);
    }



    public void capNhatThoiDiemBan(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Cap nhat thoi diem ban");
            System.out.println("| 1. Them thoi diem ban");
            System.out.println("| 2. Xoa thoi diem ban");
            System.out.println("| 3. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.capNhatThemThoiDiemBan();
                    break;
                case 2:
                    this.xoaThoiDiemBan();
                    break;
                case 3:
                    done = true;
            }
        }while (!done);
    }

    public void xuatSanPham(){
        System.out.println("-------------------------------------");
        System.out.printf("Ma san pham: %d\n", this.maSanPham);
        System.out.printf("Ten san pham: %s\n", this.ten);
        System.out.printf("Gia ban: %f\n", this.giaBan);
        if(this.tinhTrang==true)
            System.out.println("Tinh trang: Con");
        else System.out.println("Tinh trang: Het");
        System.out.println("Thoi diem ban: ");
        this.thoiDiemBan.forEach(tg -> System.out.printf("-%s\n",tg.xuatThoiDiemBan()));
    }

    public abstract void capNhatSanPham();

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }


    public List<ThoiDiemBan> getThoiDiemBan() {
        return thoiDiemBan;
    }

    public void setThoiDiemBan(List<ThoiDiemBan> thoiDiemBan) {
        this.thoiDiemBan = thoiDiemBan;
    }
}
