package Cafe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhanVien {
    public static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    public static final Scanner s = new Scanner(System.in);
    private static int dem;
    private int maNv = ++dem;
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private Date ngaySinh;
    private Date ngayVao;

    public void nhapNv() throws ParseException {
        System.out.print("Nhap ho ten: ");
        this.setHoTen(s.nextLine());
        System.out.print("Nhap gioi tinh: ");
        this.setGioiTinh(s.nextLine());
        System.out.print("Nhap que quan: ");
        this.setQueQuan(s.nextLine());
        System.out.print("Nhap ngay sinh: ");
        this.setNgaySinh(F.parse(s.nextLine()));
        System.out.print("Nhap ngay vao: ");
        this.setNgayVao(F.parse(s.nextLine()));
    }

    @Override
    public String toString() {
        return String.format("Ma so nhan vien: %d\nHo to: %s\nGioi tinh: %s\nQue quan: %s\nNgay sinh: %s\nNgay vao: %s\n"
        , this.getMaNv(), this.getHoTen(), this.getGioiTinh(), this.getQueQuan(), F.format(this.getNgaySinh()), F.format(this.getNgayVao()));
    }

    public void capNhatTen(){
        System.out.print("Nhap ten: ");
        this.setHoTen(s.nextLine());
    }

    public void capNhatGioiTinh(){
        System.out.print("Nhap gioi tinh: ");
        this.setGioiTinh(s.nextLine());
    }

    public void capNhatQueQuan(){
        System.out.print("Nhap que quan: ");
        this.setQueQuan(s.nextLine());
    }

    public void capNhatNgaySinh() throws ParseException {
        System.out.print("Nhap ngay sinh: ");
        this.setNgaySinh(F.parse(s.nextLine()));
    }

    public void capNhatNgayVao() throws ParseException {
        System.out.print("Nhap ngay vao: ");
        this.setNgayVao(F.parse(s.nextLine()));
    }
    public void capNhatMaNhanVien() throws ParseException {
        System.out.print("Nhap ma nhan vien: ");
        this.setMaNv(s.nextInt());
    }

    public void menuQuanLyThongTinNhanVien() throws ParseException {
        int choice;
        boolean done = false;
        do {
            choice = 0;

            System.out.println("-------------------------------------");
            System.out.println("| Quan ly thong tin nhan vien");
            System.out.println("| 1. Cap nhat ma nhan vien");
            System.out.println("| 2. Cap nhat ten");
            System.out.println("| 3. Cap nhat gioi tinh");
            System.out.println("| 4. Cap nhat que quan");
            System.out.println("| 5. Cap nhat ngay sinh");
            System.out.println("| 6. Cap nhat ngay vao");
            System.out.println("| 7. Xem lai thong tin nhan vien");
            System.out.println("| 8. Thoat");
            System.out.println("Lua chon cua ban: ");
            choice = s.nextInt();

//            if (choice == 4){
//                System.exit(1);
//            }

            switch (choice) {
                case 1:
                    this.capNhatMaNhanVien();
                    break;
                case 2:
                    this.capNhatTen();
                    break;
                case 3:
                    this.capNhatGioiTinh();
                    break;
                case 4:
                    this.capNhatQueQuan();
                    break;
                case 5:
                    this.capNhatNgaySinh();
                    break;
                case 6:
                    this.capNhatNgayVao();
                    break;
                case 7:
                    System.out.print(this);
                    break;
                case 8:
                    done = true;
            }
        }while (!done);
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(Date ngayVao) {
        this.ngayVao = ngayVao;
    }
}
