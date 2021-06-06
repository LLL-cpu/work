package cn.itcast.domain;

/**
 * @author chnuo
 * @create 2021-01-13  15:01
 */
public class Personnel_info {
    String INFO_NO;
    String INFO_NAME;
    int INFO_AGE;
    String INFO_SEX;
    String INFO_MONEY;
    String INFO_JNAME;
    String INFO_DNAME;

    public Personnel_info() {
    }

    public Personnel_info(String INFO_NO, String INFO_NAME, int INFO_AGE, String INFO_SEX, String INFO_MONEY, String INFO_JNAME, String INFO_DNAME) {
        this.INFO_NO = INFO_NO;
        this.INFO_NAME = INFO_NAME;
        this.INFO_AGE = INFO_AGE;
        this.INFO_SEX = INFO_SEX;
        this.INFO_MONEY = INFO_MONEY;
        this.INFO_JNAME = INFO_JNAME;
        this.INFO_DNAME = INFO_DNAME;
    }

    @Override
    public String toString() {
        return "Personnel_info{" +
                "INFO_NO='" + INFO_NO + '\'' +
                ", INFO_NAME='" + INFO_NAME + '\'' +
                ", INFO_AGE=" + INFO_AGE +
                ", INFO_SEX='" + INFO_SEX + '\'' +
                ", INFO_MONEY='" + INFO_MONEY + '\'' +
                ", INFO_JNAME='" + INFO_JNAME + '\'' +
                ", INFO_DNAME='" + INFO_DNAME + '\'' +
                '}';
    }

    public String getINFO_NO() {
        return INFO_NO;
    }

    public void setINFO_NO(String INFO_NO) {
        this.INFO_NO = INFO_NO;
    }

    public String getINFO_NAME() {
        return INFO_NAME;
    }

    public void setINFO_NAME(String INFO_NAME) {
        this.INFO_NAME = INFO_NAME;
    }

    public int getINFO_AGE() {
        return INFO_AGE;
    }

    public void setINFO_AGE(int INFO_AGE) {
        this.INFO_AGE = INFO_AGE;
    }

    public String getINFO_SEX() {
        return INFO_SEX;
    }

    public void setINFO_SEX(String INFO_SEX) {
        this.INFO_SEX = INFO_SEX;
    }

    public String getINFO_MONEY() {
        return INFO_MONEY;
    }

    public void setINFO_MONEY(String INFO_MONEY) {
        this.INFO_MONEY = INFO_MONEY;
    }

    public String getINFO_JNAME() {
        return INFO_JNAME;
    }

    public void setINFO_JNAME(String INFO_JNAME) {
        this.INFO_JNAME = INFO_JNAME;
    }

    public String getINFO_DNAME() {
        return INFO_DNAME;
    }

    public void setINFO_DNAME(String INFO_DNAME) {
        this.INFO_DNAME = INFO_DNAME;
    }
}
