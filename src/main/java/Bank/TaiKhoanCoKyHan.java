package Bank;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TaiKhoanCoKyHan extends TaiKhoan{
    private KyHan kyHan;
    private Calendar ngayDaoHan;

    public TaiKhoanCoKyHan(String ten, BigDecimal st, KyHan kh) {
        super(ten, st);
        this.kyHan = kh;
        this.ngayDaoHan = this.kyHan.tinhDaoHan(new GregorianCalendar());
    }

    @Override
    public String toString() {
        return String.format("%sKy han: %s\nNgay dao han: %s\n",
                super.toString(), this.kyHan, F.format(this.ngayDaoHan.getTime()));
    }

    public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    public Calendar getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(Calendar ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
}
