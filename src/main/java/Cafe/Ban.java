package Cafe;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ban {
    public static final Scanner s = new Scanner(System.in);
    private static int dem;
    private String maBan = String.format("B%03d", ++dem);
    private int sucChua;
    private boolean tinhTrang=true;


    public void xuatBan(){
        System.out.printf("Ma ban: %s\n", this.maBan);
        System.out.printf("Suc chua: %d\n", this.sucChua);
        if(this.tinhTrang==true)
            System.out.println("Tinh trang: Trong\n");
        else System.out.println("Tinh trang: Day\n");
    }

    public void nhapBan(){
        System.out.print("Nhap suc chua: ");
        this.sucChua = s.nextInt();
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Tinh trang");
            System.out.println("| 1. Day");
            System.out.println("| 2. Trong");
            System.out.println("| 3. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.tinhTrang = false;
                    break;
                case 2:
                    this.tinhTrang = true;
                    break;
                case 3:
                    done = true;
            }
        }while (!done);
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
