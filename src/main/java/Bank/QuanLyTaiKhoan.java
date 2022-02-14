package Bank;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();

    public void themTk(TaiKhoan t){
        this.ds.add(t);
    }

    public void xuatDs(){
        this.ds.forEach(t -> System.out.println(t));
    }

    public List<TaiKhoan> getDs() {
        return ds;
    }

    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
}
