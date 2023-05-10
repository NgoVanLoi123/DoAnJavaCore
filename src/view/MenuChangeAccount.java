package view;

import entity.Account;
import handle.RegisterHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuChangeAccount {

    ArrayList<Account> accountArrayList=new ArrayList<>();
    MenuMainLogin menuMainLogin=new MenuMainLogin();
    RegisterHandle registerHandle=new RegisterHandle();
    public void menu(Scanner sc,Account account,ArrayList<Account> accountArrayList) {
        int option=0;
        try{
            System.out.println("1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");
            System.out.println("Mời bạn nhập lựa chọn:");
            option = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Bạn phải nhập 1 số trong menu");
            this.menu(sc,account,accountArrayList);
        }
        switch (option) {
            case 1:
                System.out.println("Nhập username bạn muốn thay đổi:");
                //nhập đúng định dạng
                String username=registerHandle.inputUsername(sc,accountArrayList);
                //thay đổi username
                account.setUserName(username);
                System.out.println("Thay đổi username thành công!");
                this.menu(sc,account,accountArrayList);
                break;
            case 2:
                System.out.println("Nhập email bạn muốn thay đổi:");
                //nhập đúng định dạng
                String email = registerHandle.inputEmail(sc, accountArrayList);
                //thay đổi email
                account.setEmail(email);
                System.out.println("Thay đổi email thành công!");
                this.menu(sc,account,accountArrayList);
                break;
            case 3:
                System.out.println("Nhập password bạn muốn thay đổi:");
                //nhập đúng định dạng
                String password = registerHandle.inputPassword(sc, accountArrayList);
                //thay đổi mật khẩu
                account.setPassWord(password);
                System.out.println("Thay đổi password thành công!");
                this.menu(sc,account,accountArrayList);
                break;
            case 4:
                menuMainLogin.Menu(sc, accountArrayList);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này! Vui lòng nhập lại");
                this.menu(sc,account,accountArrayList);
                break;
        }


    }
}

