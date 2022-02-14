package Cafe;

import BaiViet.QuanLyBaiViet;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class QuanLyBoPhan {
    public static final Scanner s = new Scanner(System.in);
    private List<BoPhan> dsBp = new ArrayList<>();

    public void themBoPhan(){
        BoPhan bp = new BoPhan();
        bp.nhapBoPhan();
        this.dsBp.add(bp);
    }

    public BoPhan timBoPhan(){
        System.out.print("Nhap ma bo: ");
        int id = s.nextInt();
        try {
            BoPhan bp = this.dsBp.stream().filter(b -> b.getMaBoPhan() == id).findFirst().get();
            return bp;
        }catch (NoSuchElementException ex){
            return null;
        }
    }

    public void xuatDanhSachBoPhan(){
        this.dsBp.forEach(bp -> bp.xuatBoPhan());
    }

    public void xoaBoPhan(){
        BoPhan bp = this.timBoPhan();
        if (bp != null) {
            this.dsBp.remove(bp);
        }
        else
            System.out.println("Bo phan khong ton tai!");
    }

    public void menuQuanLyBoPhan() throws ParseException {
        int choice;
        boolean done = false;
        do {
            choice = 0;

            System.out.println("-------------------------------------");
            System.out.println("| Quan ly bo phan");
            System.out.println("| 1. Them bo phan");
            System.out.println("| 2. Xoa bo phan");
            System.out.println("| 3. Xuat danh sach bo phan");
            System.out.println("| 4. Chon bo phan de quan ly");
            System.out.println("| 5. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.themBoPhan();
                    break;
                case 2:
                    this.xoaBoPhan();
                    break;
                case 3:
                    this.xuatDanhSachBoPhan();
                    break;
                case 4:
                    BoPhan bp = this.timBoPhan();
                    bp.menuQuanLyNhanVien();
                    break;
                case 5:
                    done = true;
            }
        }while (!done);

    }

}
