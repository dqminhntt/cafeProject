package BaiViet;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class BaiViet {
    private static int dem;
    private int id = ++dem;
    private String ten;
    private List<Action> act;

    public BaiViet(String t){
        this.ten =  t;
        this.act = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("==========\nMa bai biet: %d\nTen bai viet: %s\n============\n",
                this.id, this.ten);
    }

    public int demLike(){
        return (int) this.act.stream().filter(t -> t instanceof Like).count();
    }

    public int demThaTim(){
        return (int) this.act.stream().filter(t -> t instanceof Love).count();
    }

    public String themAction(Action a){
        this.act.add(a);
        return a.getAction(this.id);
    }

    public int tinhDiem(){
        return this.act.stream().flatMapToInt(a -> IntStream.of(a.diem)).sum();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<Action> getAct() {
        return act;
    }

    public void setAct(List<Action> act) {
        this.act = act;
    }
}
