package cn.itcast.Uilts;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author chnuo
 * @create 2021-01-13  19:25
 */
public class SqlUtil {
    InputStream in;
    SqlSession sqlSession;

    public SqlUtil() {
        try {
            in=Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            sqlSession = factory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getMapper(Class clazz){
        return sqlSession.getMapper(clazz);
    }

    public void close(){
        sqlSession.commit();
        sqlSession.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
