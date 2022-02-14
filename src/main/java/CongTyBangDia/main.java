package CongTyBangDia;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        SanPham sp1 = new Sach();
        sp1.nhap();
        SanPham.s.nextLine();
        SanPham sp2 = new BangDia();
        sp2.nhap();
        SanPham.s.nextLine();

        QuanLySp ql = new QuanLySp();
        ql.themSp(sp1);
        ql.themSp(sp2);
        ql.themSp("Sach");
        ql.xuat();
    }
}
