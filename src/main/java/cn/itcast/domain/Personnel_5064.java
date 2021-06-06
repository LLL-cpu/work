package cn.itcast.domain;

import java.io.Serializable;

/**
 * @author chnuo
 * @create 2021-01-13  9:56
 */
public class Personnel_5064 implements Serializable {
    String Pno;
    String Pname;
    int Page;
    String Pmoney;
    String Psex;

    @Override
    public String toString() {
        return "Personnel_5064Dao{" +
                "Pno='" + Pno + '\'' +
                ", Pname='" + Pname + '\'' +
                ", Page=" + Page +
                ", Pmoney='" + Pmoney + '\'' +
                ", Psex='" + Psex + '\'' +
                '}';
    }

    public Personnel_5064() {
    }

    public Personnel_5064(String pno, String pname, int page, String pmoney, String psex) {
        Pno = pno;
        Pname = pname;
        Page = page;
        Pmoney = pmoney;
        Psex = psex;
    }

    public String getPno() {
        return Pno;
    }

    public void setPno(String pno) {
        Pno = pno;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public String getPmoney() {
        return Pmoney;
    }

    public void setPmoney(String pmoney) {
        Pmoney = pmoney;
    }

    public String getPsex() {
        return Psex;
    }

    public void setPsex(String psex) {
        Psex = psex;
    }
}
