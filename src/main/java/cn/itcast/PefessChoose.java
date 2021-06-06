package cn.itcast;

import cn.itcast.Uilts.SqlUtil;
import cn.itcast.dao.Comment_5064Dao;
import cn.itcast.dao.Personnel_5064Dao;
import cn.itcast.dao.Personnel_infoDao;
import cn.itcast.dao.State_5064Dao;
import cn.itcast.domain.Personnel_5064;
import cn.itcast.domain.Personnel_info;
import cn.itcast.domain.State_5064;
import java.util.Scanner;

/**
 * @author chnuo
 * @create 2021-01-13  21:12
 */
public class PefessChoose {
    //修改个人信息
    public boolean updateInfo(String Pno){
        SqlUtil sql = new SqlUtil();
        Personnel_5064 ps = new Personnel_5064();
        Scanner sc = new Scanner(System.in);
        System.out.println("姓名：");
        ps.setPname(sc.nextLine());
        System.out.println("年龄：");
        ps.setPage(sc.nextInt());
        System.out.println("性别：");
        ps.setPsex(sc.nextLine());
        ps.setPno(Pno);
        ps.setPmoney("3000");
        Personnel_5064Dao mapper = (Personnel_5064Dao) sql.getMapper(Personnel_5064Dao.class);
        mapper.update(ps);
        sql.close();
        return false;
    }

    //查看个人信息
    public boolean lookInfo(String Pno){
        SqlUtil sql = new SqlUtil();
        Personnel_infoDao mapper = (Personnel_infoDao) sql.getMapper(Personnel_infoDao.class);
        Personnel_info personnel_info = mapper.find(Pno);
        System.out.println("工号："+personnel_info.getINFO_NO()+"   姓名："+personnel_info.getINFO_NAME()+"   性别："+ personnel_info.getINFO_SEX()+
                "    年龄："+personnel_info.getINFO_AGE()+"   工资："+personnel_info.getINFO_MONEY()+"   部门："+personnel_info.getINFO_DNAME()+"   岗位："+ personnel_info.getINFO_JNAME());
        sql.close();
        return false;
    }

    //请假
    public boolean hoilday(String Pno){
        SqlUtil sql = new SqlUtil();
        State_5064Dao mapper = (State_5064Dao) sql.getMapper(State_5064Dao.class);
        State_5064 s = new State_5064(Pno,"请假");
        mapper.update(s);
        sql.close();
        return false;
    }

    //看评论
    public boolean lookComment(String Pno){
        SqlUtil sql = new SqlUtil();
        Comment_5064Dao mapper = (Comment_5064Dao) sql.getMapper(Comment_5064Dao.class);
        String s = mapper.find(Pno);
        sql.close();
        System.out.println(s);
        return false;
    }
}
