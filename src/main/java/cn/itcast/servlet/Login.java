package cn.itcast.servlet;

import cn.itcast.Worker;
import cn.itcast.services.User_pswd_5064Service;

import java.util.Scanner;

/**
 * @author chnuo
 * @create 2021-01-13  19:19
 */
public class Login {
    public boolean login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号：");
        String username = sc.nextLine();
        System.out.println();
        System.out.print("请输入密码：");
        String password = sc.nextLine();
        System.out.println();
        User_pswd_5064Service ups = new User_pswd_5064Service();
        boolean b = ups.login(username, password);
        if(b){
            System.out.println("登录成功");
            Worker worker = new Worker(username);
            worker.choose();
        }else{
            System.out.println("登录失败请注意密码与账号信息是否正确");
        }
        return b;
    }

    public boolean regist(){
        System.out.println("开始注册");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号：");
        String username = sc.nextLine();
        System.out.println();
        System.out.print("请输入密码：");
        String password = sc.nextLine();
        System.out.println();
        User_pswd_5064Service ups = new User_pswd_5064Service();
        boolean regist = ups.regist(username, password);
        if(regist){
            System.out.println("注册成功");
        }
        else{
            System.out.println("注册失败");
        }
        return false;
    }
}
