package Bank;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaiKhoan {
    public static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem;
    private String soTk;
    private String tenTk;
    private BigDecimal soTien;
    private Date ngayTao;

    {
        soTk = String.format("%06d", ++dem);
        ngayTao = new Date();
    }

    public TaiKhoan(String ten, BigDecimal st){
        this.tenTk = ten;
        this.soTien = st;
    }



    public double tinhTienLai(){
        return 0;
    }

    @Override
    public String toString() {
        return String.format("So tai khoan: %s\nTen tai khoan: %s\nSo tien: %.1f VND\n" +
                "Ngay tao: %s\n", this.soTk, this.tenTk, this.soTien, F.format(this.ngayTao));
    }

    public void rutTien(){

    }

    public String getSoTk() {
        return soTk;
    }

    public void setSoTk(String soTk) {
        this.soTk = soTk;
    }

    public String getTenTk() {
        return tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    public BigDecimal getSoTien() {
        return soTien;
    }

    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
}
