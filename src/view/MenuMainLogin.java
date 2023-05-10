package view;

import entity.Account;
import handle.LogInHandle;
import handle.RegisterHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuMainLogin {

    RegisterHandle registerHandle= new RegisterHandle();
    ArrayList<Account> accountArrayList=new ArrayList<>();
    public void Menu(Scanner sc,ArrayList<Account> accountArrayList){
        int option=0;
        try{
            System.out.println("1- Đăng nhập");
            System.out.println("2- Đăng kí");
            System.out.println("Mời bạn lựa chọn:");
            option =Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Bạn phải nhập 1 số trong menu");
            this.Menu(sc,accountArrayList);
        }
        switch(option){
            case 1:
                //đăng nhập
                if(accountArrayList.size()==0){
                    System.out.println("Bạn cần phải đăng kí tài khoản trước!");
                    this.Menu(sc,accountArrayList);
                }
                LogInHandle logInHandle=new LogInHandle();
                logInHandle.LogIn(sc,accountArrayList);
                break;
            case 2:
                //đăng kí
                System.out.println("Nhập username");
                String username= registerHandle.inputUsername(sc,accountArrayList);
                System.out.println("Nhập email");
                String email =registerHandle.inputEmail(sc,accountArrayList);
                System.out.println("Nhập password");
                String password =registerHandle.inputPassword(sc,accountArrayList);
                Account newAccount =new Account(username,email,password);
                if(accountArrayList.add(newAccount)){
                    System.out.println("Đăng kí thành công");
                    System.out.println("Danh sách tài khoản đã đăng kí là");
                    System.out.println(accountArrayList);
                    this.Menu(sc,accountArrayList);
                }else{
                    System.out.println("Đăng kí thất bại");
                    this.Menu(sc,accountArrayList);
                }
                break;
        }
    }
}

