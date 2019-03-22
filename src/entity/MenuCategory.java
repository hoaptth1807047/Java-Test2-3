package entity;

import controller.CategoryController;

import java.util.Scanner;

public class MenuCategory {
    public void createMenuCate() {
        Scanner scanner = new Scanner(System.in);
        CategoryController controller = new CategoryController();
        while (true) {
            System.out.println("----- Category -----");
            System.out.println("1. Thêm danh mục.");
            System.out.println("2. Hiển thị danh sách danh mục.");
            System.out.println("3. Thoát.");
            System.out.println("---------------");
            System.out.println("Vui lòng nhập lựa chọn của bạn: ");
            int role = scanner.nextInt();
            switch (role) {
                case 1:
                    controller.addCategory();
                    break;
                case 2:
                    controller.printListCate();
                    break;
                case 3:
                    System.out.println("Đã thoát!");
                    break;
                default:
                    System.out.println("Lựa chọn sai. Vui lòng chọn lại từ 1 đến 3!.");
                    break;
            }
            if(role == 3){
                System.out.println("Hẹn gặp lại.");
                break;
            }
        }
    }
}
