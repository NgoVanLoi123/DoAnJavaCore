package view;

import entity.Account;
import handle.CartHandle;
import handle.PictureHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuHome {
    public void menu(Scanner sc){
        ArrayList<Account> accountArrayList =new ArrayList<>();

        PictureHandle pictureHandle =new PictureHandle();
        MenuTopicPicture menuTopicPicture=new MenuTopicPicture();
        int choice;
        do{
            System.out.println("                Tranh sơn mài Việt Nam");
            System.out.println("1. Xem danh sách tranh");
            System.out.println("2. Tìm kiếm tranh theo tên");
            System.out.println("3. Kiểm tra đơn hàng");
            System.out.println("4. Giỏ hàng");
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
                    CartHandle cartHandle=new CartHandle();
                    cartHandle.displayCart(sc);
                    break;
                case 5:
                    MenuMainLogin menuMainLogin =new MenuMainLogin();
                    menuMainLogin.Menu(sc,accountArrayList);
                    break;
                case 6:
                    System.out.println("Bạn đã thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại");
            }
        }while(choice!=6);



    }
}

