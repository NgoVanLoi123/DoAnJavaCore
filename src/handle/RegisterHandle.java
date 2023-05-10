package handle;

import entity.Account;
import exception.InvalidEmailException;
import exception.InvalidPasswordException;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterHandle {
    FormatHandle formatHandle=new FormatHandle();
    LogInHandle logInHandle =new LogInHandle();
    ArrayList<Account> accountArrayList=new ArrayList<>();
    public String inputUsername(Scanner sc,ArrayList<Account>accountArrayList){
        boolean check =false;
        String username=new String();
        while(!check){
            username =sc.nextLine();
            if(logInHandle.checkUserName(username,accountArrayList)!=null){
                System.out.println("Username đã tồn tại trong tài khoản!Vui lòng nhập username khác");
            }else{
                check=true;

            }
        }
        return username;

    }
    public String inputEmail(Scanner sc,ArrayList<Account> accountArrayList){
        String email =new String();
        boolean check =false;
        while(!check){
            email=sc.nextLine();
            if(logInHandle.checkEmail(email,accountArrayList)!=null){
                System.out.println("Email đã được đăng kí trong tài khoản!Vui lòng nhập email khác");
            }else{
                //email chưa được đăng kí trong tài khoản , kiểm tra định dạng
                try{
                    if(!formatHandle.validateEmail(email)){
                        throw new InvalidEmailException("Email không hợp lệ!");
                    }
                    else{
                        check=true;
                    }
                }catch(InvalidEmailException e){
                    System.out.println(e.getMessage()+"Vui lòng nhập lại");
                }
            }
        }
        return email;
    }
    public String inputPassword(Scanner sc,ArrayList<Account> accountArrayList){
        String password =new String();
        boolean check =false;
        while(!check){
            password=sc.nextLine();
            try{
                if(!formatHandle.validatePassword(password)){
                    throw new InvalidPasswordException("Password không mạnh!");
                }else{
                    check =true;
                }

            }catch(InvalidPasswordException e){
                System.out.println(e.getMessage()+" Vui lòng nhập lại");
            }

        }
        return password;
    }
}

