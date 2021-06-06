package cn.itcast.domain;

import java.io.Serializable;

/**
 * @author chnuo
 * @create 2021-01-13  9:54
 */
public class State_5064 implements Serializable {
    String Pno;
    String Pstate;

    @Override
    public String toString() {
        return "State_5064{" +
                "Pno='" + Pno + '\'' +
                ", Pstate='" + Pstate + '\'' +
                '}';
    }

    public State_5064() {
    }

    public State_5064(String pno, String pstate) {
        Pno = pno;
        Pstate = pstate;
    }

    public String getPno() {
        return Pno;
    }

    public void setPno(String pno) {
        Pno = pno;
    }

    public String getPstate() {
        return Pstate;
    }

    public void setPstate(String pstate) {
        Pstate = pstate;
    }
}
