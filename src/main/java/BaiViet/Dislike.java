package BaiViet;

public class Dislike extends Action{
    public Dislike(){
        this.diem = -1;
    }

    @Override
    public String getAction(int id) {
        return String.format("Co nguoi dislike bai viet %d cua ban.", id);
    }
}
