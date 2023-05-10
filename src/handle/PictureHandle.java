package handle;

import entity.Account;
import entity.Picture;
import entity.User;
import view.MenuMain;

import java.util.ArrayList;
import java.util.Scanner;

public class PictureHandle {

    LogInHandle logInHandle=new LogInHandle();
    ArrayList<Picture> pictureList;
    public PictureHandle(){
        pictureList =new ArrayList<>();
        // Tranh tân gia-phong thủy
        pictureList.add(new Picture(1, "Tranh tân gia-phong thủy", "Tranh sơn mài vẽ sen dát vàng", 1000000, "Việt Nam", "50x70 cm", 2.5, "Mô tả 1",100));
        pictureList.add(new Picture(2, "Tranh tân gia-phong thủy", "Tranh hoa sen treo tường", 2000000, "Trung Quốc", "60x80 cm", 3.0, "Mô tả 2",100));
        pictureList.add(new Picture(3, "Tranh tân gia-phong thủy", "Tranh đĩa sơn mài thuận buồm", 1500000, "Hàn Quốc", "70x90 cm", 3.5, "Mô tả 3",100));
        pictureList.add(new Picture(4, "Tranh tân gia-phong thủy", "Tranh cô gái sen", 2500000, "Nhật Bản", "60x100 cm", 4.0, "Mô tả 4",100));
        pictureList.add(new Picture(5, "Tranh tân gia-phong thủy", "Tranh chim trĩ phu thê", 3500000, "Việt Nam", "80x120 cm", 5.0, "Mô tả 5",100));
        // Tranh trang trí
        pictureList.add(new Picture(6, "Tranh trang trí", "Tranh phố cổ ", 1200000, "Hàn Quốc", "40x60 cm", 1.5, "Mô tả 6",100));
        pictureList.add(new Picture(7, "Tranh trang trí", "Tranh mai vàng trúc xanh", 1800000, "Trung Quốc", "50x70 cm", 2.0, "Mô tả 7",100));
        pictureList.add(new Picture(8, "Tranh trang trí", "Tranh phố cổ", 2200000, "Việt Nam", "60x80 cm", 2.5, "Mô tả 8",100));
        pictureList.add(new Picture(9, "Tranh trang trí", "Tranh sơn mài 3D cá mẫu", 2800000, "Nhật Bản", "70x100 cm", 3.5, "Mô tả 9",100));
        pictureList.add(new Picture(10, "Tranh trang trí", "Tranh bộ 3 bông phú quý", 3800000, "Hàn Quốc", "80x120 cm", 4.5, "Mô tả 10",100));
        //tranh chủ đề Việt Nam
        pictureList.add(new Picture(11, "Tranh chủ đề Việt Nam", "Tranh đĩa sơn mài cảnh đồng quê", 1200000, "Việt Nam", "60x90 cm", 3.0, "Mô tả 6",100));
        pictureList.add(new Picture(12, "Tranh chủ đề Việt Nam", "Tranh hoa sen trăng nền đen", 1500000, "Việt Nam", "70x100 cm", 3.5, "Mô tả 7",100));
        pictureList.add(new Picture(13, "Tranh chủ đề Việt Nam", "Tranh đồng quê khói", 2000000, "Việt Nam", "80x120 cm", 4.0, "Mô tả 8",100));
        pictureList.add(new Picture(14, "Tranh chủ đề Việt Nam", "Tranh sơn mài vỏ trai", 2500000, "Việt Nam", "90x130 cm", 4.5, "Mô tả 9",100));
        pictureList.add(new Picture(15, "Tranh chủ đề Việt Nam", "Tranh phong cảnh quê hương", 3000000, "Việt Nam", "100x150 cm", 5.0, "Mô tả 10",100));
        //tranh sơn mài cao cấp
        pictureList.add(new Picture(16, "Tranh sơn mài cao cấp", "Tranh hoa sen sơn mài hiện đại", 4500000, "Trung Quốc", "80x100 cm", 3.2, "Mô tả 15",100));
        pictureList.add(new Picture(17, "Tranh sơn mài cao cấp", "Tranh hoa sứ cẩn nổi", 5500000, "Trung Quốc", "100x120 cm", 4.0, "Mô tả 16",100));
        pictureList.add(new Picture(18, "Tranh sơn mài cao cấp", "Tranh sơn mài cô gái áo dài", 6000000, "Trung Quốc", "90x110 cm", 3.7, "Mô tả 17",100));
        pictureList.add(new Picture(19, "Tranh sơn mài cao cấp", "Tranh mai lan cúc trúc", 7000000, "Trung Quốc", "110x150 cm", 5.0, "Mô tả 18",100));
        pictureList.add(new Picture(20, "Tranh sơn mài cao cấp", "Tranh cửu huyền thất tổ", 8000000, "Trung Quốc", "120x160 cm", 5.5, "Mô tả 19",100));
        //tranh tứ quý
        pictureList.add(new Picture(21, "Tranh tứ quý", "Tranh tứ quý mai lan", 3000000, "Việt Nam", "60x60 cm", 2.0, "Mô tả 16",100));
        pictureList.add(new Picture(22, "Tranh tứ quý", "Tranh cửu ngư", 4000000, "Việt Nam", "60x60 cm", 2.0, "Mô tả 17",100));
        pictureList.add(new Picture(23, "Tranh tứ quý", "Tranh cúc trúc sơn thủy ", 5000000, "Việt Nam", "60x60 cm", 2.0, "Mô tả 18",100));
        pictureList.add(new Picture(24, "Tranh tứ quý", "Tranh cúc trúc nền xanh", 6000000, "Việt Nam", "60x60 cm", 2.0, "Mô tả 19",100));
        pictureList.add(new Picture(25, "Tranh tứ quý", "Tranh treo tường tứ quý ", 7000000, "Việt Nam", "60x60 cm", 2.0, "Mô tả 20",100));

// Tranh mã đáo thành công
        pictureList.add(new Picture(26, "Tranh mã đáo thành công", "Tranh mã đáo truy phong", 3000000, "Việt Nam", "60x90 cm", 3.0, "Mô tả 21",100));
        pictureList.add(new Picture(27, "Tranh mã đáo thành công", "Tranh truy phong đắp nổi", 4000000, "Việt Nam", "60x90 cm", 3.0, "Mô tả 22",100));
        pictureList.add(new Picture(28, "Tranh mã đáo thành công", "Tranh mã đáo nền ấm", 5000000, "Việt Nam", "60x90 cm", 3.0, "Mô tả 23",100));
        pictureList.add(new Picture(29, "Tranh mã đáo thành công", "Tranh mã đáo hợp tuổi Dần", 6000000, "Việt Nam", "60x90 cm", 3.0, "Mô tả 24",100));
        pictureList.add(new Picture(30, "Tranh mã đáo thành công", "Tranh lịch sơn mài ", 7000000, "Việt Nam", "60x90 cm", 3.0, "Mô tả 25",100));

// Tranh phong thủy hợp tuổi
        pictureList.add(new Picture(31, "Tranh phong thủy hợp tuổi", "Mã đáo truy phong hợp tuổi Thìn, Tuất", 3000000, "Trung Quốc", "80x120 cm", 4.0, "Mô tả 26",100));
        pictureList.add(new Picture(32, "Tranh phong thủy hợp tuổi", "Đàn hạc tiên hợp tuổi Thân", 4000000, "Trung Quốc", "80x120 cm", 4.0, "Mô tả 27",100));
        pictureList.add(new Picture(33, "Tranh phong thủy hợp tuổi", "Thuận buồm xuôi gió cẩn nổi", 5000000, "Trung Quốc", "80x120 cm", 4.0, "Mô tả 28",100));
        pictureList.add(new Picture(34, "Tranh phong thủy hợp tuổi", "Tranh đồng quê hợp tuổi", 5500000, "Trung Quốc", "80x120 cm", 3.5, "Mô tả 29",100));
        pictureList.add(new Picture(35, "Tranh phong thủy hợp tuổi", "Tranh cá Phúc - Lộc - Thọ hợp Tuổi Tỵ", 6000000, "Trung Quốc", "80x120 cm", 3.0, "Mô tả 30",100));
    }
    public void allPictureList(){
        for(Picture picture:pictureList){
            System.out.println("ID: "+picture.getId());
            System.out.println("Chủ đề: "+picture.getTopic());
            System.out.println("Tiêu đề: "+picture.getTitle());
            System.out.println("Giá tiền: " + picture.getPrice());
        }
    }
    public void pictureTopic1(){
        for (Picture picture : pictureList) {
            if (picture.getId() >= 1 && picture.getId() <= 5 && picture.getTopic().equals("Tranh tân gia-phong thủy")) {
                System.out.println("ID: " + picture.getId());
                System.out.println("Chủ đề: " + picture.getTopic());
                System.out.println("Tiêu đề: " + picture.getTitle());
                System.out.println("Giá bán: " + picture.getPrice());
            }
        }

    }
//    System.out.println("2. Tranh trang trí");
//            System.out.println("3. Tranh chủ đề Việt Nam");
//            System.out.println("4. Tranh sơn mài cao cấp");
//            System.out.println("5. Tranh tứ quý");
//            System.out.println("6. Tranh mã đáo thành công");
//            System.out.println("7. Tranh phong thủy hợp tuổi");
//            System.out.println("8. Xem tất cả sản phẩm");
//            System.out.println("9. Quay lại trang chủ");
//            System.out.println("Mời bạn lựa chọn:");
    public void pictureTopic2(){
        for (Picture picture : pictureList) {
            if (picture.getId() >= 6 && picture.getId() <= 10 && picture.getTopic().equals("Tranh trang trí")) {
                System.out.println("ID: " + picture.getId());
                System.out.println("Chủ đề: " + picture.getTopic());
                System.out.println("Tiêu đề: " + picture.getTitle());
                System.out.println("Giá bán: " + picture.getPrice());
            }
        }

    }
    public void pictureTopic3(){
        for (Picture picture : pictureList) {
            if (picture.getId() >= 11 && picture.getId() <= 15 && picture.getTopic().equals("Tranh chủ đề Việt Nam")) {
                System.out.println("ID: " + picture.getId());
                System.out.println("Chủ đề: " + picture.getTopic());
                System.out.println("Tiêu đề: " + picture.getTitle());
                System.out.println("Giá bán: " + picture.getPrice());
            }
        }

    }
    public void pictureTopic4(){
        for (Picture picture : pictureList) {
            if (picture.getId() >= 16 && picture.getId() <= 20 && picture.getTopic().equals("Tranh sơn mài cao cấp")) {
                System.out.println("ID: " + picture.getId());
                System.out.println("Chủ đề: " + picture.getTopic());
                System.out.println("Tiêu đề: " + picture.getTitle());
                System.out.println("Giá bán: " + picture.getPrice());
            }
        }

    }
    public void pictureTopic5(){
        for (Picture picture : pictureList) {
            if (picture.getId() >= 21 && picture.getId() <= 25 && picture.getTopic().equals("Tranh tứ quý")) {
                System.out.println("ID: " + picture.getId());
                System.out.println("Chủ đề: " + picture.getTopic());
                System.out.println("Tiêu đề: " + picture.getTitle());
                System.out.println("Giá bán: " + picture.getPrice());
            }
        }

    }
    public void pictureTopic6(){
        for (Picture picture : pictureList) {
            if (picture.getId() >= 26 && picture.getId() <= 30 && picture.getTopic().equals("Tranh mã đáo thành công")) {
                System.out.println("ID: " + picture.getId());
                System.out.println("Chủ đề: " + picture.getTopic());
                System.out.println("Tiêu đề: " + picture.getTitle());
                System.out.println("Giá bán: " + picture.getPrice());
            }
        }

    }
    public void pictureTopic7(){
        for (Picture picture : pictureList) {
            if (picture.getId() >= 31 && picture.getId() <= 35 && picture.getTopic().equals("Tranh phong thủy hợp tuổi")) {
                System.out.println("ID: " + picture.getId());
                System.out.println("Chủ đề: " + picture.getTopic());
                System.out.println("Tiêu đề: " + picture.getTitle());
                System.out.println("Giá bán: " + picture.getPrice());
            }
        }

    }
    private Picture findPictureById(int id) {
        for (Picture picture : pictureList) {
            if (picture.getId() == id) {
                return picture;
            }
        }
        return null;
    }
    public void showPictureDetail(int id) {
        Picture picture = findPictureById(id);
        if (picture != null) {
            System.out.println("Details of painting with ID " + id + ":\n");
            System.out.println("Title: " + picture.getTitle());
            System.out.println("Price: $" + picture.getPrice());
            System.out.println("Origin: " + picture.getOrigin());
            System.out.println("Size: " + picture.getSize());
            System.out.println("Weight: " + picture.getWeight());
            System.out.println("Description: " + picture.getDescription());
        } else {
            System.out.println("No painting found with ID " + id);
        }
    }
    public void searchByKeyword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập từ khóa cần tìm: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Picture picture : pictureList) {
            if (picture.getTitle().toLowerCase().contains(keyword)) {
                System.out.println("Id: " + picture.getId() + ", Chủ đề: " + picture.getTopic() + ", Tiêu đề: " + picture.getTitle()+", Gía bán: "+picture.getPrice());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy thông tin liên quan đến từ khóa \"" + keyword + "\".");
        }
    }
    //hàm kiểm tra id có tồn tại trong danh sách tranh không
    public Picture checkIdPicture(int id){
        for(Picture picture: pictureList){
            if(picture.getId()==id){
                return picture;
            }
        }
        return null;
    }




}
