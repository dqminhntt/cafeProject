package Cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHoaDon {
    public static final Scanner s = new Scanner(System.in);
    private List<HoaDon> dshd = new ArrayList<>();

    public void themHoaDon(HoaDon hd){
        this.dshd.add(hd);
    }

    public void xuatDanhSachHoaDon(){
        this.dshd.forEach(hd -> hd.xuatHoaDon());
    }

    public void menuQuanLyHoaDon(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Quan hoa don");
            System.out.println("| 1. Xuat hoa don");
            System.out.println("| 2. Cap nhat hoa don");
            System.out.println("| 3. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.xuatDanhSachHoaDon();
                    break;
                case 2:
                    done = true;
            }
        }while (!done);
    }
}
