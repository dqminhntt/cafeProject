package CongTyBangDia;

public class Sach extends SanPham{
    private int soTrang;

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap so trang: ");
        this.setSoTrang(s.nextInt());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("So trang: %d\n", this.soTrang);
        System.out.println("============");
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
