package cn.itcast.domain;

import java.io.Serializable;

/**
 * @author chnuo
 * @create 2021-01-13  10:00
 */
public class Depart_5064 implements Serializable {
    String Dno;
    String Dname;

    public String getDno() {
        return Dno;
    }

    @Override
    public String toString() {
        return "Depart_5064{" +
                "Dno='" + Dno + '\'' +
                ", Dname='" + Dname + '\'' +
                '}';
    }

    public void setDno(String dno) {
        Dno = dno;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public Depart_5064() {
    }

    public Depart_5064(String dno, String dname) {
        Dno = dno;
        Dname = dname;
    }
}
