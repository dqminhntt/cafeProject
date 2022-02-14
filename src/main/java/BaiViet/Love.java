package BaiViet;

public class Love extends Action{
    public Love(){
        this.diem = 3;
    }

    @Override
    public String getAction(int id) {
        return String.format("Co nguoi love bai viet %d cua ban!", id);
    }
}
