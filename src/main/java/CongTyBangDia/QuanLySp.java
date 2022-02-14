package CongTyBangDia;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySp {
    private List<SanPham> ds = new ArrayList<>();

    public void themSp(SanPham sp){
        this.ds.add(sp);
    }

    public void themSp(String loaiSp) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            Class c = Class.forName("CongTyBangDia." + loaiSp);
            SanPham s = (SanPham) c.getDeclaredConstructor(null).newInstance();
            s.nhap();
            this.ds.add(s);
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException ex){
            ex.printStackTrace();
        }
//        SanPham s = null;
//        if (loaiSp.equals("Sach"))
//            s = new Sach();
//        else if (loaiSp.equals("BangDia"))
//            s = new BangDia();
//        if (s != null) {
//            s.nhap();
//            this.ds.add(s);
//        }
    }

    public void xuat(){
        this.ds.forEach(s -> s.xuat());
    }

    public List<SanPham> timKiem(String kw){
        System.out.println("====Tim Kiem====");
        return this.ds.stream().filter(s -> s.getTenSp().contains(kw) == true)
                .collect(Collectors.toList());
    }

    public List<SanPham> timKiemLoai(String loaiSp){
        System.out.println("====Tim theo loai====");
        return this.ds.stream().filter(s -> {
            if(loaiSp.equals("Sach"))
                return  s instanceof Sach;
            else if (loaiSp.equals("Bang dia"))
                return  s instanceof  BangDia;
            return false;
        }).collect(Collectors.toList());

    }

    public void sapXep(){
        System.out.println("====Sap xep gia tang dan====");
        this.ds.sort((s1, s2) -> {
            double g1 = s1.getGia();
            double g2 = s2.getGia();

            return g1 > g2?1:(g1 < g2?-1:0);
        });
    }

    public List<SanPham> getDs() {
        return ds;
    }

    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
}
