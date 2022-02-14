package Cafe;

import BaiViet.BaiViet;

import java.text.ParseException;
import java.util.*;

public class BoPhan {
    public static final Scanner s = new Scanner(System.in);
    private static int dem;
    private int maBoPhan = ++dem;
    private String tenBoPhan;
    private List<NhanVien> dsNv = new ArrayList<>();

    public NhanVien timNhanVien(){
        System.out.print("Nhap ma nhan vien can tim: ");
        int id = s.nextInt();
        try {
            NhanVien nv = this.dsNv.stream().filter(b -> b.getMaNv() == id).findFirst().get();
            return nv;
        }catch (NoSuchElementException ex){
            return null;
        }
    }

    public void menuQuanLyNhanVien() throws ParseException {
            int choice;
            boolean done = false;
            do {
                choice = 0;

                System.out.println("-------------------------------------");
                System.out.println("| Quan ly nhan vien trong bo pham");
                System.out.println("| 1. Them nhan vien");
                System.out.println("| 2. Xoa nhan vien");
                System.out.println("| 3. Cap nhat nhan vien");
                System.out.println("| 4. Xem danh sach nhan vien");
                System.out.println("| 5. Thoat");
                System.out.println("Lua chon cua ban: ");
                choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

                switch (choice) {
                    case 1:
                        this.themNhanVien();
                        break;
                    case 2:
                        NhanVien nv = this.timNhanVien();
                        this.dsNv.remove(nv);
                        break;
                    case 3:
                        NhanVien nv1 = this.timNhanVien();
                        nv1.menuQuanLyThongTinNhanVien();
                        break;
                    case 4:
                        this.xuatDanhSachNhanVien();
                        break;
                    case 5:
                        done = true;
                }
            }while (!done);

        }


    public void themNhanVien() throws ParseException {
        NhanVien nv = new NhanVien();
        nv.nhapNv();
        this.dsNv.add(nv);
    }

    public void nhapBoPhan(){
        System.out.print("Nhap ten bo phan: ");
        this.tenBoPhan = s.nextLine();
    }

    public void xuatDanhSachNhanVien(){
        this.dsNv.forEach(nv -> System.out.print(nv));
    }

    @Override
    public String toString() {
        return String.format("Ma bo phan: %d\nTen bo phan: %s\n", this.maBoPhan, this.tenBoPhan);
    }

    public void xuatBoPhan(){
        System.out.println(this);
    }

    public void xoaToanBoNhanVien(){
        this.dsNv.forEach(nv -> this.dsNv.remove(nv));
    }

    public int getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(int maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }
}
