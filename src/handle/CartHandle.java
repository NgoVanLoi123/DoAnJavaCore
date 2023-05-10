package handle;

import entity.Picture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CartHandle {
    PictureHandle pictureHandle = new PictureHandle();
    private ArrayList<Picture> pictures;

    public CartHandle() {
        pictures = new ArrayList<>();
    }

    //kiểm tra id có tồn tại trong giỏ hàng không
    public boolean checkIdCart(int id) {
        for (Picture picture : pictures) {
            if (picture.getId() == id) {
                return true;
            }
        }
        return false;

    }

    public void addCart(Scanner sc) {
        System.out.println("Nhập id sản phẩm cần thêm vào:");
        int id = Integer.parseInt(sc.nextLine());
        Picture picture = pictureHandle.checkIdPicture(id);
        if (picture == null) {
            System.out.println("Không tồn tại id" + id + " trong cửa hàng! Vui lòng nhập lại ");
        } else {
            if (!checkIdCart(id)) {
                picture.setQuantity(1);
                pictures.add(picture);
                System.out.println("Thêm giỏ hàng thành công");
            } else {
                for (Picture pictureCart : pictures) {
                    if (pictureCart.getId() == id) {
                        pictureCart.setQuantity(pictureCart.getQuantity() + 1);
                        System.out.println("Thêm giỏ hàng thành công");
                        break;
                    }
                }
            }
        }
    }

    //hàm update sản phẩm
    public void updateQuantity(Scanner sc) {
        System.out.println("Nhập id bức tranh cần thay đổi số lượng: ");
        int id = Integer.parseInt(sc.nextLine());
        if (!checkIdCart(id)) {
            System.out.println("ID:" + id + " không tồn tại trong giỏ hàng");
        } else {
            boolean checkRemove=false;
            for (Picture pictureCart : pictures) {
                if (pictureCart.getId() == id) {
                    System.out.println("Số lượng hiện tại là:" + pictureCart.getQuantity());
                    int newQuantity;
                    do {
                        System.out.println("Mời bạn cập nhật số lượng mới:");
                        newQuantity = Integer.parseInt(sc.nextLine());
                        if (newQuantity < 0) {
                            System.out.println("Yêu cầu nhập số lượng >=0");
                        } else {
                            if (newQuantity > 100) {
                                System.out.println("Mặt hàng hiện tại chỉ còn 100 bức tranh");
                            } else if (newQuantity > 0) {
                                pictureCart.setQuantity(newQuantity);
                                break;
                            } else if (newQuantity == 0) {
                               checkRemove=true;
                                break;
                            }
                        }
                    } while (newQuantity < 0);

                }

            }
            if(checkRemove){
                pictures.removeIf(pictureCart->pictureCart.getId()==id);
            }
        }
    }

    //tính tổng tiền
    public double totalPrice() {
        double totalMoney = 0;
        for (Picture picture : pictures) {
            totalMoney += picture.getPrice() * picture.getQuantity();
        }
        return totalMoney;
    }

    //hàm xóa sản phẩm
    public void removePicture(Scanner sc) {
        System.out.println("Nhập id của bức tranh cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        if (!checkIdCart(id)) {
            System.out.println("ID:" + id + " không tồn tại trong giỏ hàng");
        } else {
            for (Picture pictureCart : pictures) {
                if (pictureCart.getId() == id) {
                    pictures.remove(pictureCart);
                    break;
                }
            }
        }
    }

    public void displayCart(Scanner sc) {
        if (pictures == null || (pictures != null && pictures.isEmpty())) {
            System.out.println("Giỏ hàng của bạn đang trống.");
        } else {
            for (Picture picture : pictures) {
                System.out.println("id: " + picture.getId());
                System.out.println("tên: " + picture.getTitle());
                System.out.println("giá: " + picture.getPrice());
                System.out.println("số lượng: " + picture.getQuantity());
                System.out.println("tổng tiền: " + picture.getQuantity() * picture.getPrice());
            }
            System.out.println("1. Cập nhật số lượng");
            System.out.println("2. Xóa");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                updateQuantity(sc);
            } else if (choice == 2) {
                removePicture(sc);
            }
        }
    }


    public Picture add(Scanner sc) {
        System.out.println("Nhập id sản phẩm cần thêm vào:");
        int id = Integer.parseInt(sc.nextLine());

        Picture pictureToAdd = pictureHandle.checkIdPicture(id);

        if (pictureToAdd == null) {
            System.out.println("Không tồn tại id " + id + " trong cửa hàng! Vui lòng nhập lại.");
            return null;
        }

        for (Picture picture : pictures) {
            if (picture.getId() == id) {
                if (picture.getQuantity() == 0) {
                    picture.setQuantity(1);
                    System.out.println("Thêm sản phẩm vào giỏ hàng thành công!");
                } else {
                    picture.setQuantity(picture.getQuantity() + 1);
                    System.out.println("Tăng số lượng sản phẩm trong giỏ hàng thành công!");
                }
                return picture;
            }
        }

        pictureToAdd.setQuantity(1);
        pictures.add(pictureToAdd);
        System.out.println("Thêm sản phẩm vào giỏ hàng thành công!");
        return pictureToAdd;
    }

}
