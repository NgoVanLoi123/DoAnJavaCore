import entity.Account;
import view.MenuMain;
import view.MenuMainLogin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MenuMain menuMain =new MenuMain();
        menuMain.menu(sc);
//        ArrayList<Account> accountArrayList =new ArrayList<>();
//        Scanner sc=new Scanner(System.in);
//        MenuMainLogin menuMain=new MenuMainLogin();
//        menuMain.Menu(sc,accountArrayList);
    }
}