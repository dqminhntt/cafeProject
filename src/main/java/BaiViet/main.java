package BaiViet;

public class main {
    public static void main(String[] args) {
        BaiViet b1 = new BaiViet("A");
        BaiViet b2 = new BaiViet("B");
        BaiViet b3 = new BaiViet("C");
        BaiViet b4 = new BaiViet("D");

        System.out.println(b1.themAction(new Like()));
        System.out.println(b1.themAction(new Love()));
        System.out.println(b1.themAction(new Dislike()));

        b2.themAction(new Like());
        b2.themAction(new Like());
        b2.themAction(new Like());
        b2.themAction(new Like());
        b2.themAction(new Love());
        b2.themAction(new Love());
        b2.themAction(new Love());
        b2.themAction(new Love());

        b3.themAction(new Like());
        b3.themAction(new Like());
        b3.themAction(new Like());
        b3.themAction(new Like());


        b4.themAction(new Like());
        b4.themAction(new Like());
        b4.themAction(new Like());


        QuanLyBaiViet ql = new QuanLyBaiViet();
        ql.themBaiVit(b1);
        ql.themBaiVit(b2);
        ql.themBaiVit(b3);
        ql.themBaiVit(b4);

        System.out.println("====Bai viet like nhieu nhat====");
        ql.timBaiLikeNhieuNhat().forEach(t -> System.out.println(t));
        ql.timBaiViet();
        System.out.println("====Bai viet nhieu diem nhat====");
        ql.sapXepTheoDiem();

    }
}
