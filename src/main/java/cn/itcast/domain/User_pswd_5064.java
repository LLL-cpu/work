package cn.itcast.domain;

import java.io.Serializable;

/**
 * @author chnuo
 * @create 2021-01-13  9:51
 */
public class User_pswd_5064 implements Serializable {
    String UUSER;
    String PSWD;

    @Override
    public String toString() {
        return "User_pswd_5064Dao{" +
                "UUSER='" + UUSER + '\'' +
                ", PSWD='" + PSWD + '\'' +
                '}';
    }

    public User_pswd_5064() {
    }

    public User_pswd_5064(String UUSER, String PSWD) {
        this.UUSER = UUSER;
        this.PSWD = PSWD;
    }

    public String getUUSER() {
        return UUSER;
    }

    public void setUUSER(String UUSER) {
        this.UUSER = UUSER;
    }

    public String getPSWD() {
        return PSWD;
    }

    public void setPSWD(String PSWD) {
        this.PSWD = PSWD;
    }
}
