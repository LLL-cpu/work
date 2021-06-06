package cn.itcast;

import cn.itcast.servlet.Login;

import java.util.Scanner;

/**
 * @author chnuo
 * @create 2021-01-13  19:18
 */
public class start {
    public static void main(String[] args) {
        int i;
        boolean b=false;
        Login lg = new Login();
        Scanner sc = new Scanner(System.in);
        System.out.println("已启动人事管理系统，请输入数字，选择功能");
        while (!b){
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出");
            i=sc.nextInt();
            if (i==1) b=lg.login();
            else if (i==2) b=lg.regist();
            else b=true;
        }
    }
}
