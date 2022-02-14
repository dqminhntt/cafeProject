package BaiViet;

public abstract class Action {
    protected int diem;

    public abstract String getAction(int id);

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
}
