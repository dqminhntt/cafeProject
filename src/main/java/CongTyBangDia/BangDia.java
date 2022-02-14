package CongTyBangDia;

public class BangDia extends SanPham{
    private double doDai;

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap do dai phat: ");
        this.doDai = s.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Do dai phat: %.2f\n", this.doDai);
        System.out.println("============");
    }

    public double getDoDai() {
        return doDai;
    }

    public void setDoDai(double doDai) {
        this.doDai = doDai;
    }
}
