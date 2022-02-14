package Cafe;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ThucAn extends SanPham{
    public static final Scanner s = new Scanner(System.in);
    private boolean anChay;


    @Override
    public void nhapSanPham(){
        super.nhapSanPham();
        super.themThoiDiemBan();
        this.capNhatChayMan();
    }
    public void capNhatChayMan(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Mon chay hay man");
            System.out.println("| 1. Chay");
            System.out.println("| 2. Man");
            System.out.println("| 3. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.anChay = true;
                    break;
                case 2:
                    this.anChay = false;
                    break;
                case 3:
                    done = true;
            }
        }while (!done);
    }


    @Override
    public void xuatSanPham(){
        super.xuatSanPham();
        if (this.anChay==true)
            System.out.println("An chay: Co");
        else
            System.out.println("An chay: Khong");
    }

    @Override
    public void capNhatSanPham(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Cap nhat san pham");
            System.out.println("| 1. Ten san pham");
            System.out.println("| 2. Gia ban");
            System.out.println("| 3. Tinh trang");
            System.out.println("| 4. Thoi diem ban");
            System.out.println("| 5. Chay man");
            System.out.println("| 6. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.capNhatTen();
                    break;
                case 2:
                    System.out.print("Nhap gia ban: ");
                    this.setGiaBan(s.nextDouble());
                    break;
                case 3:
                    this.nhapTinhTrang();
                    break;
                case 4:
                    this.capNhatThoiDiemBan();
                    break;
                case 5:
                    this.capNhatChayMan();
                    break;
                case 6:
                    done = true;
            }
        }while (!done);
    }

    public void capNhatTen(){
        System.out.print("Nhap ten san pham: ");
        s.nextLine();
        this.setTen(s.nextLine());
    }

    public boolean isAnChay() {
        return anChay;
    }

    public void setAnChay(boolean anChay) {
        this.anChay = anChay;
    }
}
