package Bank;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {
        TaiKhoan t1 =new TaiKhoan("Nguyen Van A",
                new BigDecimal(500000000));
        TaiKhoan t2 = new TaiKhoanCoKyHan("Tran Thi B",
                new BigDecimal(1500000000), KyHan.MOT_TUAN);
        TaiKhoan t3 = new TaiKhoanCoKyHan("Vo Van C",
                new BigDecimal(250000000), KyHan.MOT_THANG);

        QuanLyTaiKhoan ql = new QuanLyTaiKhoan();
        ql.themTk(t1);
        ql.themTk(t2);
        ql.themTk(t3);

        ql.xuatDs();
    }
}
