package Bank;

import java.util.Calendar;

public enum KyHan {
    MOT_TUAN{
        @Override
        public Calendar tinhDaoHan(Calendar current) {
            current.add(Calendar.DAY_OF_YEAR, 7);
            return current;
        }
    },
    MOT_THANG{
        @Override
        public Calendar tinhDaoHan(Calendar current) {
            current.add(Calendar.MONTH, 1);
            return current;
        }
    },
    MOT_NAM{
        @Override
        public Calendar tinhDaoHan(Calendar current) {
            current.add(Calendar.YEAR, 1);
            return current;
        }
    };


    public abstract Calendar tinhDaoHan(Calendar current);
}
