import cn.itcast.dao.User_pswd_5064Dao;
import cn.itcast.domain.User_pswd_5064;
import cn.itcast.services.User_pswd_5064Service;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author chnuo
 * @create 2021-01-13  10:47
 */
public class Test {
    public static void main(String[] args) throws IOException {
        User_pswd_5064Service user_pswd_5064Service = new User_pswd_5064Service();
        boolean login = user_pswd_5064Service.regist("3118005000", "12345");
        System.out.println(login);
    }
}
