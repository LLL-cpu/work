package cn.itcast.domain;

import java.io.Serializable;

/**
 * @author chnuo
 * @create 2021-01-13  9:55
 */
public class Position_5064 implements Serializable {
    String Pno;
    String Jname;
    String Dname;

    @Override
    public String toString() {
        return "Position_5064{" +
                "Pno='" + Pno + '\'' +
                ", Jname='" + Jname + '\'' +
                ", Dname='" + Dname + '\'' +
                '}';
    }

    public Position_5064() {
    }

    public Position_5064(String pno, String jname, String dname) {
        Pno = pno;
        Jname = jname;
        Dname = dname;
    }

    public String getPno() {
        return Pno;
    }

    public void setPno(String pno) {
        Pno = pno;
    }

    public String getJname() {
        return Jname;
    }

    public void setJname(String jname) {
        Jname = jname;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }
}
