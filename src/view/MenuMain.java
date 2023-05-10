package view;

import entity.Account;
import handle.PictureHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuMain {
    public void menu(Scanner sc){
        ArrayList<Account> accountArrayList =new ArrayList<>();
        PictureHandle pictureHandle =new PictureHandle();
        MenuTopicPicture menuTopicPicture=new MenuTopicPicture();
        int choice;
        do{
            System.out.println("                Tranh sơn mài Việt Nam");
            System.out.println("1. Xem danh mục sản phẩm");
            System.out.println("2. Tìm kiếm sản phẩm theo tên");
            System.out.println("4. Đăng nhập/Đăng kí");
            System.out.println("5. Thoát chương trình");
            System.out.println("Mời bạn lựa chọn:");
            choice =Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    MenuListPicture menuListPicture =new MenuListPicture();
                    menuListPicture.menu(sc);
                    break;
                case 2:
                    pictureHandle.searchByKeyword();
                    menuTopicPicture.menu(sc);
                    break;
                case 3:
                    break;
                case 4:
                    MenuMainLogin menuMainLogin =new MenuMainLogin();
                    menuMainLogin.Menu(sc,accountArrayList);
                    break;
                case 5:
                    System.out.println("Bạn đã thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại");
            }
        }while(choice!=5);



    }
}
