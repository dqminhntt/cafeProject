package Cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class QuanLyBan {
    public static final Scanner s = new Scanner(System.in);
    private List<Ban> ban = new ArrayList<>();
    private List<SanPham> dssp = new ArrayList<>();

    public QuanLyBan(List<SanPham> dssp){
        this.dssp = dssp;
    }

    public void menuQuanLyBan(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Chon loai san pham");
            System.out.println("| 1. Tao ban");
            System.out.println("| 2. Xoa ban");
            System.out.println("| 3. Xuat danh sach ban");
            System.out.println("| 5. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.taoBan();
                    break;
                case 2:
                    this.ban.remove(this.timBan());
                    break;
                case 3:
                    this.ban.forEach(b -> b.xuatBan());
                    break;
                case 4:
                    done = true;
            }
        }while (!done);
    }

    public void taoBan(){
        Ban b = new Ban();
        b.nhapBan();
        this.ban.add(b);
    }

    public Ban timBan(){
        System.out.println("Nhap ma ban: ");
        s.nextLine();
        String x = s.nextLine();
        for(Ban b : ban){
            if (b.getMaBan().equals(x)){
                return b;
            }
        }
        return null;
    }

    public void datBan(){
        Ban x = new Ban();
        x = this.timBan();
        x.setTinhTrang(false);
    }

    public void menuDatBan(QuanLyHoaDon qlhd){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Quan ly dat ban");
            System.out.println("| 1. Dat ban");
            System.out.println("| 2. Tra ban");
            System.out.println("| 3. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    Ban x = new Ban();
                    x = this.timBan();
                    x.setTinhTrang(false);
                    this.datMon(x.getMaBan(), qlhd);
                    break;
                case 2:
                    this.traBan();
                    break;
                case 3:
                    done = true;
            }
        }while (!done);
    }

    public void datMon(String mb, QuanLyHoaDon qlhd){
        boolean done = false;
        HoaDon hd = new HoaDon(mb, 0);
        double tongTien = 0;
        do {
            int choice;
            System.out.println("-------------------------------------");
            System.out.println("| Danh sach cac mon an");
            this.dssp.forEach(sp -> sp.xuatSanPham());
            System.out.println("| 0. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }
            if(choice != 0) {
                try {
                    SanPham sp1 = this.dssp.stream().filter(b -> b.getMaSanPham() == choice).findFirst().get();
                    System.out.print("Nhap so luong: ");
                    int soLuong = s.nextInt();
                    tongTien += sp1.getGiaBan()*soLuong;
                    hd.setTongTien(tongTien);
                    
                } catch (NoSuchElementException ex) {
                    System.out.println("| San pham khong ton tai!");
                }
            }
            else {
                qlhd.themHoaDon(hd);
                done = true;
            }
        }while (!done);
    }

    public void traBan(){
        this.timBan().setTinhTrang(true);
    }
}
