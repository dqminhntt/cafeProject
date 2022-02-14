package Cafe;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ThucUong extends SanPham{
    private boolean coDa;

    @Override
    public void nhapSanPham(){
        super.nhapSanPham();
        super.themThoiDiemBan();
        this.capNhatCoDa();
    }

    public void capNhatCoDa(){
        int choice;
        boolean done = false;
        do {
            choice = 0;
            System.out.println("-------------------------------------");
            System.out.println("| Co da hay khong");
            System.out.println("| 1. Co");
            System.out.println("| 2. Khong");
            System.out.println("| 3. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();
//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.coDa = true;
                    break;
                case 2:
                    this.coDa = false;
                    break;
                case 3:
                    done = true;
            }
        }while (!done);
    }

    @Override
    public void xuatSanPham(){
        super.xuatSanPham();
        if (this.coDa==true)
            System.out.println("Thuc uong co da");
        else
            System.out.println("Thuc uong khong da");
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
                    System.out.print("Nhap ten san pham: ");
                    this.setTen(s.nextLine());
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
                    this.capNhatCoDa();
                    break;
                case 6:
                    done = true;
            }
        }while (!done);
    }

    public boolean isCoDa() {
        return coDa;
    }

    public void setCoDa(boolean coDa) {
        this.coDa = coDa;
    }
}
