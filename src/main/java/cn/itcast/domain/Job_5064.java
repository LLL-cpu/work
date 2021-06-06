package cn.itcast.domain;

import java.io.Serializable;

/**
 * @author chnuo
 * @create 2021-01-13  9:59
 */
public class Job_5064 implements Serializable {
    String Jon;
    String Jname;

    @Override
    public String toString() {
        return "Job_5064{" +
                "Jon='" + Jon + '\'' +
                ", Jname='" + Jname + '\'' +
                '}';
    }

    public String getJon() {
        return Jon;
    }

    public void setJon(String jon) {
        Jon = jon;
    }

    public String getJname() {
        return Jname;
    }

    public void setJname(String jname) {
        Jname = jname;
    }

    public Job_5064(String jon, String jname) {
        Jon = jon;
        Jname = jname;
    }

    public Job_5064() {
    }
}
