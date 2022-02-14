package Cafe;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException, IOException, InterruptedException {
        Scanner s = new Scanner(System.in);
        QuanLyBoPhan ql = new QuanLyBoPhan();
        QuanLySanPham qlsp = new QuanLySanPham();
        QuanLyBan qlb = new QuanLyBan(qlsp.getSp());
        QuanLyHoaDon qlhd = new QuanLyHoaDon();
        int choice;
        while (true) {
            choice = 0;

            System.out.println("-------------------------------------");
            System.out.println("| Chuong trinh quan ly quan cafe");
            System.out.println("| 1. Quan ly bo phan");
            System.out.println("| 2. Quan ly san pham");
            System.out.println("| 3. Quan ly ban");
            System.out.println("| 4. Quan ly dat ban");
            System.out.println("| 5. Quan ly hoa don");
            System.out.println("| 6. Thoat chuong trinh");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

            if (choice == 6){
                System.exit(0);
            }

            switch(choice){
                case 1:
                    ql.menuQuanLyBoPhan();
                    break;
                case 2:
                    qlsp.menuQuanLySanPham();
                    break;
                case 3:
                    qlb.menuQuanLyBan();
                    break;
                case 4:
                    qlb.menuDatBan(qlhd);
                    break;
                case 5:
                    qlhd.menuQuanLyHoaDon();
                    break;
            }
        }


    }

}
