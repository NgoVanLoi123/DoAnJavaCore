package view;

import entity.Account;
import handle.LogInHandle;
import handle.RegisterHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPassword {
    ArrayList<Account> accountArrayList=new ArrayList<>();
    LogInHandle logInHandle=new LogInHandle();
    MenuMainLogin menuMain= new MenuMainLogin();
    RegisterHandle registerHandle=new RegisterHandle();


    public void menuPassword(Scanner sc,ArrayList<Account> accountArrayList){
        int option=0;
        try{
            System.out.println("1 - Đăng nhập lại.");
            System.out.println("2 - Quên mật khẩu");
            System.out.println("Mời bạn lựa chọn");
            option=Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Bạn phải nhập 1 số trong menu");
            this.menuPassword(sc,accountArrayList);
        }


        switch(option){
            case 1:
                logInHandle.LogIn(sc,accountArrayList);
                break;
            case 2:
                boolean check=true;
                while(check){
                    System.out.println("Nhập Email:");
                    String email=sc.nextLine();
                    if(logInHandle.checkEmail(email,accountArrayList)!=null){
                        System.out.println("Mời bạn nhập mật khẩu mới:");
                        //nhập đúng chuẩn password
                        String password=registerHandle.inputPassword(sc,accountArrayList);
                        for(Account x:accountArrayList){
                            if(x.getEmail().equals(email)){
                                x.setPassWord(password);
                            }
                        }
                        System.out.println("Thay đổi mật khẩu thành công!");
                        menuMain.Menu(sc,accountArrayList);
                        check=false;
                    }else{
                        System.out.println("Chưa tồn tại tài khoản này!Vui lòng nhập lại email");
                    }
                }
                break;

        }
    }
}

