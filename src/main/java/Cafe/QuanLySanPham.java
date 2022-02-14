package Cafe;

import java.util.*;
import java.util.stream.Collectors;

public class QuanLySanPham {
    public static final Scanner s = new Scanner(System.in);
    private List<SanPham> sp = new ArrayList<>();

    public void themThucAn(){
        SanPham ta = new ThucAn();
        ta.nhapSanPham();
        this.sp.add(ta);
    }

    public void themThucUong(){
        SanPham tu = new ThucUong();
        tu.nhapSanPham();
        this.sp.add(tu);
    }

    public void themSanPham(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Chon loai san pham");
            System.out.println("| 1. Thuc an");
            System.out.println("| 2. Nuoc uong");
            System.out.println("| 3. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.themThucAn();
                    break;
                case 2:
                    this.themThucUong();
                    break;
                case 3:
                    done = true;
            }
        }while (!done);
    }

    public void xuatDanhSachSanPham(){
        if(this.sp!=null)
            this.sp.forEach(sp ->sp.xuatSanPham());
        else
            System.out.println("Khong co san pham!");
    }

    public SanPham timSanPham(){
        System.out.print("Nhap ma san pham: ");
        int x = s.nextInt();
        try {
            SanPham sp1 = this.sp.stream().filter(b -> b.getMaSanPham() == x).findFirst().get();
            return sp1;
        }catch (NoSuchElementException ex){
            return null;
        }
    }



    public void menuQuanLySanPham(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Quan ly san pham");
            System.out.println("| 1. Them san pham");
            System.out.println("| 2. Xuat danh sach san pham");
            System.out.println("| 3. Cap nhat san pham");
            System.out.println("| 4. Xoa het san pham");
            System.out.println("| 5. Quan ly theo loai");
            System.out.println("| 6. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.themSanPham();
                    break;
                case 2:
                    this.xuatDanhSachSanPham();
                    break;
                case 3:
                    this.timSanPham().capNhatSanPham();
                    break;
                case 4:
                    this.xoaHetSanPham();

                    break;
                case 5:
                    this.quanLySanPhamTheoLoai();
                    break;
                case 6:
                    done = true;
            }
        }while (!done);

    }

    public void quanLySanPhamTheoLoai(){
        QuanLySanPham qlsp = new QuanLySanPham();
        int choice;
        boolean done = false;
        do {
            qlsp.xoaHetSanPham();
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Chon chuc nang quan ly");
            System.out.println("| 1. Tim kiem theo khoang gia");
            System.out.println("| 2. Sap xep gia giam dan");
            System.out.println("| 3. Sap xep gia tang dan");
            System.out.println("| 4. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    break;
                case 2:
                    this.menuTimLoaiSanPham().forEach(sp -> qlsp.sp.add(sp));
                    qlsp.sapXepGiamDanTheoGia();
                    qlsp.xuatDanhSachSanPham();
                    break;
                case 3:
                    this.menuTimLoaiSanPham().forEach(sp -> qlsp.sp.add(sp));
                    qlsp.sapXepTangDanTheoGia();
                    qlsp.xuatDanhSachSanPham();
                    break;
                case 4:
                    done = true;
            }
        }while (!done);
    }

    public void xoaHetSanPham(){
        this.sp.clear();
    }

    public void sapXepTangDanTheoGia(){
        this.sp.sort(Comparator.comparingDouble(sp1 -> sp1.getGiaBan()));
    }

    public void sapXepGiamDanTheoGia(){
        this.sp.sort((o1, o2) -> (int) (o2.getGiaBan() - o1.getGiaBan()));
    }

//    public List<SanPham> timLoaiSanPham(String loaiSp){
//        List<SanPham> kq = new ArrayList<>();
//        return this.sp.forEach(sp -> {
//            if (loaiSp.equals("ThucAn"))
//                kq.add(sp instanceof ThucAn);
//                return kq;
//            else if (loaiSp.equals("ThucUong"))
//                return s instanceof ThucUong;
//            return false;
//        }).collect(Collectors.toList());
//    }

    public List<SanPham> menuTimLoaiSanPham(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Chon loai san pham");
            System.out.println("| 1. Thuc an");
            System.out.println("| 2. Nuoc uong");
            System.out.println("| 3. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }
            if(choice == 1){
                List<SanPham> a = new ArrayList<>();
                this.sp.forEach(sp -> {
                    if(sp instanceof ThucAn == true)
                        a.add(sp);
                });
                return a;
            }else if(choice == 2){
                List<SanPham> b = new ArrayList<>();
                this.sp.forEach(sp -> {
                    if(sp instanceof ThucUong == true)
                        b.add(sp);
                });
                return b;
            }else if (choice == 3)
                done = true;
            } while (!done);
        return null;
    }

    public List<SanPham> getSp() {
        return sp;
    }

    public void setSp(List<SanPham> sp) {
        this.sp = sp;
    }
}
