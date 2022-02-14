package BaiViet;

public class Like extends Action{
    public Like(){
        this.diem = 2;
    }

    @Override
    public String getAction(int id) {
        return String.format("Co nguoi like bai viet %d cua ban!", id);
    }
}
