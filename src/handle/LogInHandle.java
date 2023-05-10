package handle;

import entity.Account;
import entity.User;
import view.MenuHome;
import view.MenuMain;
import view.MenuPassword;
import view.MenuChangeAccount;

import java.util.ArrayList;
import java.util.Scanner;


public class LogInHandle {
    ArrayList<Account> accountArrayList = new ArrayList<>();

    public Account checkLogin(String username, String password, ArrayList<Account> accountArrayList) {
        for (Account x : accountArrayList) {
            if (x.getUserName().equals(username) && x.getPassWord().equals(password)) {
                return x;
            }
        }
        return null;
    }

    public Account checkUserName(String username, ArrayList<Account> accountArrayList) {
        for (Account x : accountArrayList) {
            if (x.getUserName().equals(username)) {
                return x;
            }
        }
        return null;
    }

    public Account checkPassWord(String password, ArrayList<Account> accountArrayList) {
        for (Account x : accountArrayList) {
            if (x.getPassWord().equals(password)) {
                return x;
            }
        }
        return null;
    }

    public Account checkEmail(String email, ArrayList<Account> accountArrayList) {
        for (Account x : accountArrayList) {
            if (x.getEmail().equals(email)) {
                return x;
            }
        }
        return null;
    }

    public void LogIn(Scanner sc, ArrayList<Account> accountArrayList) {
        boolean check = false;
        while (!check) {
            System.out.println("Nhập username:");
            String username = sc.nextLine();
            System.out.println("Nhập password:");
            String password = sc.nextLine();
            Account account = this.checkLogin(username, password, accountArrayList);
            if (account != null) {
                System.out.println("Chào mừng  " + account.getUserName() + "  bạn có thể thực hiện các công việc sau: ");
                MenuHome menuHome=new MenuHome();
                User.account=account;
                menuHome.menu(sc);
//                MenuChangeAccount menuChangeAccount=new MenuChangeAccount();
//                menuChangeAccount.menu(sc,account,accountArrayList);

            } else {
                Account account1 = this.checkUserName(username, accountArrayList);
                Account account2 = this.checkPassWord(username, accountArrayList);
                if (account1 == null) {
                    System.out.println("Kiểm tra lại username!Username không tồn tại trong tài khoản. Vui lòng đăng nhập lại");
                } else if (account2 == null) {
                    System.out.println("Nhập sai password");
                    MenuPassword menuPassword = new MenuPassword();
                    menuPassword.menuPassword(sc, accountArrayList);
                }
            }
        }
    }
}

