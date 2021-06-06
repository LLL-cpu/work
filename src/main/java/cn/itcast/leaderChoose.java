package cn.itcast;

import cn.itcast.Uilts.SqlUtil;
import cn.itcast.dao.*;
import cn.itcast.domain.*;
import org.springframework.transaction.NestedTransactionNotSupportedException;

import java.util.List;
import java.util.Scanner;

/**
 * @author chnuo
 * @create 2021-01-13  22:21
 */
public class leaderChoose {
    //查看所有人的信息
    public void lookAll(){
        SqlUtil sql = new SqlUtil();
        Personnel_infoDao mapper = (Personnel_infoDao)sql.getMapper(Personnel_infoDao.class);
        List<Personnel_info> alls = mapper.findAll();
        for (Personnel_info all : alls) {
            System.out.println("工号："+all.getINFO_NO()+"   姓名："+all.getINFO_NAME()+"   性别："+ all.getINFO_SEX()+
                    "    年龄："+all.getINFO_AGE()+"   工资："+all.getINFO_MONEY()+"   部门："+all.getINFO_DNAME()+"   岗位："+ all.getINFO_JNAME());
        }
        sql.close();
    }

    //查看个人信息
    public void lookInfo(String Pno){
        SqlUtil sql = new SqlUtil();
        Personnel_infoDao mapper = (Personnel_infoDao) sql.getMapper(Personnel_infoDao.class);
        Personnel_info personnel_info = mapper.find(Pno);
        System.out.println("工号："+personnel_info.getINFO_NO()+"   姓名："+personnel_info.getINFO_NAME()+"   性别："+ personnel_info.getINFO_SEX()+
                "    年龄："+personnel_info.getINFO_AGE()+"   工资："+personnel_info.getINFO_MONEY()+"   部门："+personnel_info.getINFO_DNAME()+"   岗位："+ personnel_info.getINFO_JNAME());
        sql.close();
    }

    //批准请假
    public void lookHoilday(){
        SqlUtil sql = new SqlUtil();
        State_5064Dao mapper = (State_5064Dao) sql.getMapper(State_5064Dao.class);
        mapper.updateAll();
        System.out.println("已全部批准");
        sql.close();
    }

    //写评价
    public void writeComment(){
        SqlUtil sql = new SqlUtil();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要评价的员工的工号：");
        String Pno = sc.nextLine();
        System.out.println("请输入评价（100字以内）：");
        String comment=sc.nextLine();
        Comment_5064Dao mapper = (Comment_5064Dao) sql.getMapper(Comment_5064Dao.class);
        mapper.setComment(new Comment_5064(Pno,comment));
        System.out.println("评价完成");
        sql.close();

    }

    //修改工资
    public void changeMoney(){
        SqlUtil sql = new SqlUtil();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要更改工资的员工工号：");
        String Pno = sc.nextLine();
        System.out.println("请输入更改的金额：");
        String money = sc.nextLine();
        Personnel_5064Dao mapper = (Personnel_5064Dao) sql.getMapper(Personnel_5064Dao.class);
        Personnel_5064 personnel_5064;
        try {
            personnel_5064 = mapper.find(Pno);
            personnel_5064.setPmoney(money);
            mapper.update(personnel_5064);
        }catch (Exception e){
            System.out.println("查无此员工，更新失败");
            sql.close();
        }
        System.out.println("更改成功");
        sql.close();
    }

    //修改部门
    public void changeWork(){
        SqlUtil sql = new SqlUtil();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的员工工号:");
        String Pno = sc.nextLine();
        System.out.println("请输入需要更改的部门：");
        String Dname=sc.nextLine();
        String Jname = "员工";
        Position_5064Dao mapper = (Position_5064Dao) sql.getMapper(Position_5064Dao.class);
        try {
            Position_5064 user = mapper.find(Pno);
            if(user!=null){
                mapper.update(new Position_5064(Pno,Jname,Dname));
            }else mapper.insert(new Position_5064(Pno,Jname,Dname));
        }catch (Exception e){
            System.out.println("查无此员工，更新失败");
            sql.close();
        }
        System.out.println("更新成功");
        sql.close();
    }

    //辞退员工
    public void deleteWork(){
        SqlUtil sql = new SqlUtil();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要辞退的员工工号：");
        String Pno = sc.nextLine();
        Personnel_5064Dao mapper = (Personnel_5064Dao) sql.getMapper(Personnel_5064Dao.class);
        try {
            mapper.delete(Pno);
        }catch (Exception e){
            System.out.println("查无此员工，更新失败");
            sql.close();
        }
        System.out.println("辞退成功");
    }
}
