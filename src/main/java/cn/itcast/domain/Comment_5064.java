package cn.itcast.domain;

import java.io.Serializable;

/**
 * @author chnuo
 * @create 2021-01-13  10:02
 */
public class Comment_5064 implements Serializable {
    String Pno;
    String Pcomment;

    @Override
    public String toString() {
        return "Comment_5064{" +
                "Pno='" + Pno + '\'' +
                ", Pcomment='" + Pcomment + '\'' +
                '}';
    }

    public String getPno() {
        return Pno;
    }

    public void setPno(String pno) {
        Pno = pno;
    }

    public String getPcomment() {
        return Pcomment;
    }

    public void setPcomment(String pcomment) {
        Pcomment = pcomment;
    }

    public Comment_5064() {
    }

    public Comment_5064(String pno, String pcomment) {
        Pno = pno;
        Pcomment = pcomment;
    }
}
