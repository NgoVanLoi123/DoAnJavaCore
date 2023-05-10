package view;

import entity.Account;
import handle.CartHandle;
import handle.PictureHandle;

import java.util.ArrayList;
import java.util.Scanner;

import static entity.User.account;

public class MenuPictureDetails {
    public void menu(Scanner sc){
        CartHandle cartHandle=new CartHandle();
        ArrayList<Account> accountArrayList=new ArrayList<>();
        PictureHandle pictureHandle=new PictureHandle();
        MenuTopicPicture menuTopicPicture =new MenuTopicPicture();
        int choice;
        do{
            System.out.println("1. Thêm vào giỏ hàng");
            System.out.println("2. Xem giỏ hàng");
            System.out.println("3. Quay lại trang chủ");
            choice =Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    if(account==null){
                        System.out.println("Bạn cần phải đăng nhập trước khi thêm vào giỏ hàng");
                    }else{
                        cartHandle.addCart(sc);
                    }
                    break;
                case 2:
                    if(account==null){
                        System.out.println("Bạn cần phải đăng nhập trước khi xem vào giỏ hàng");
                    }else{
                        cartHandle.displayCart(sc);
                    }
                    break;
                case 3:
                    if(account==null){
                        MenuMain menuMain =new MenuMain();
                        menuMain.menu(sc);
                    }else{
                        MenuHome menuHome=new MenuHome();
                        menuHome.menu(sc);
                    }

                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại");
            }
        }while(choice!=3);
    }

}
