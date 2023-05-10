package view;

import entity.Account;
import handle.PictureHandle;

import java.util.Scanner;

public class MenuListPicture {
    public void menu(Scanner sc){
        PictureHandle pictureHandle =new PictureHandle();
        int choice;
        MenuTopicPicture menuTopicPicture=new MenuTopicPicture();
        do{
            System.out.println("                Danh mục tranh");
            System.out.println("1. Tranh tân gia-phong thủy");
            System.out.println("2. Tranh trang trí");
            System.out.println("3. Tranh chủ đề Việt Nam");
            System.out.println("4. Tranh sơn mài cao cấp");
            System.out.println("5. Tranh tứ quý");
            System.out.println("6. Tranh mã đáo thành công");
            System.out.println("7. Tranh phong thủy hợp tuổi");
            System.out.println("8. Xem tất cả sản phẩm");
            System.out.println("9. Quay lại trang chủ");
            System.out.println("Mời bạn lựa chọn:");
            choice=Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    pictureHandle.pictureTopic1();
                    menuTopicPicture.menu(sc);
                    break;
                case 2:
                    pictureHandle.pictureTopic2();
                    menuTopicPicture.menu(sc);
                    break;
                case 3:
                    pictureHandle.pictureTopic3();
                    menuTopicPicture.menu(sc);
                    break;
                case 4:
                    pictureHandle.pictureTopic4();
                    menuTopicPicture.menu(sc);
                    break;
                case 5:
                    pictureHandle.pictureTopic5();
                    menuTopicPicture.menu(sc);
                    break;
                case 6:
                    pictureHandle.pictureTopic6();
                    menuTopicPicture.menu(sc);
                    break;
                case 7:
                    pictureHandle.pictureTopic7();
                    menuTopicPicture.menu(sc);
                    break;
                case 8:
                    pictureHandle.allPictureList();
                    menuTopicPicture.menu(sc);
                    break;
                case 9:
                    MenuMain menuMain= new MenuMain();
                    menuMain.menu(sc);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại");
            }
        }while(choice!=8);


    }
}
