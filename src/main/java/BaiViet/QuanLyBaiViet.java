package BaiViet;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class QuanLyBaiViet {
    public static final Scanner s = new Scanner(System.in);
    private List<BaiViet> ds = new ArrayList<>();

    public void themBaiVit(BaiViet bv){
        this.ds.add(bv);
    }

    public void hienThi(){
        this.ds.forEach(bv -> System.out.println(bv));
    }

    public void timBaiViet(){
        System.out.print("Nhap ma bai viet can tim: ");
        int id = s.nextInt();
        try {
            BaiViet bv = this.ds.stream().filter(b -> b.getId() == id).findFirst().get();
            System.out.printf("So tim cua bai viet: %d\n", bv.demThaTim());
        }catch (NoSuchElementException ex){
            System.out.println("Bai viet khong ton tai!");
        }
    }

    public void sapXepTheoDiem(){
        this.ds.sort((b1,b2) -> b1.tinhDiem() - b2.tinhDiem());
    }

    public List<BaiViet> timBaiLikeNhieuNhat(){
        if (this.ds.size() > 0) {
            BaiViet max = this.ds.stream().max((b1,b2) -> b1.demLike() -b2.demLike()).get();
            List<BaiViet> lbv = new ArrayList<>();
//            for (int i = 1; i < this.ds.size(); i++) {
//                if (this.ds.get(i).demLike() > max.demLike())
//                    max = this.ds.get(i);
//            }

            for (int i = 1; i < this.ds.size(); i++) {
                if (this.ds.get(i).demLike() == max.demLike())
                    lbv.add(this.ds.get(i));
            }
            return lbv;
        }
        return null;
    }

    public List<BaiViet> getDs() {
        return ds;
    }

    public void setDs(List<BaiViet> ds) {
        this.ds = ds;
    }
}
