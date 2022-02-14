package Cafe;

public abstract class ThoiDiemBan {

    public abstract int layThoiDiemBan();

    public String xuatThoiDiemBan(){
        if (layThoiDiemBan()==1)
            return "Sang";
        else if(layThoiDiemBan()==2)
            return "Trua";
        else
            return "Chieu";
    }
}
