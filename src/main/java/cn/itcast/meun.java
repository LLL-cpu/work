package cn.itcast;

import com.fasterxml.jackson.databind.node.BooleanNode;

import java.util.Scanner;

/**
 * @author chnuo
 * @create 2021-01-13  21:01
 */
public class meun {
    //员工的菜单
    public void pefess(String Pno){
        boolean b = false;
        PefessChoose pc = new PefessChoose();
        while (!b) {
            System.out.println("你可输入数字，选择以下功能");
            System.out.println("1.修改个人信息");
            System.out.println("2.查看个人信息");
            System.out.println("3.请假");
            System.out.println("4.查看评价");
            System.out.println("5.退出");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if(i==1){
                b=pc.updateInfo(Pno);
            }else if(i==2){
                b=pc.lookInfo(Pno);
            }else if(i==3){
                b=pc.hoilday(Pno);
            }else if(i==4){
                b=pc.lookComment(Pno);
            }else{
                b=true;
            }
        }
    }

    //领导的菜单
    public void leader(String Pno){
        boolean b = false;
        leaderChoose lc = new leaderChoose();
        while (!b) {
            System.out.println("你可输入数字，选择以下功能");
            System.out.println("1.查看所有人信息");
            System.out.println("2.查看个人信息");
            System.out.println("3.请假批准");
            System.out.println("4.写评价");
            System.out.println("5.修改工资");
            System.out.println("6.调换员工的部门");
            System.out.println("7.辞退员工");
            System.out.println("8.退出");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if(i==1){
                lc.lookAll();
            }else if(i==2){
                lc.lookInfo(Pno);
            }else if(i==3){
                lc.lookHoilday();
            }else if(i==4){
                lc.writeComment();
            }else if(i==5){
                lc.changeMoney();
            }else if (i==6){
                lc.changeWork();
            }else if (i==7)
                lc.deleteWork();
            else b=true;
        }
    }
}
