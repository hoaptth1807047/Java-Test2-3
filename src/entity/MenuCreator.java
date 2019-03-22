package entity;

import controller.FoodController;

import java.util.Scanner;

public class MenuCreator {
    public void createMenu() {
        Scanner scanner = new Scanner(System.in);
        FoodController controller = new FoodController();
        while (true) {
            System.out.println("----- Foodydi -----");
            System.out.println("1. Thêm món ăn.");
            System.out.println("2. Hiển thị danh sách món ăn.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("-------------------------");
            System.out.println("Vui lòng nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.addFood();
                    break;
                case 2:
                    controller.printList();
                    break;
                case 3:
                    System.out.println("Đã thoát!");
                    break;
                default:
                    System.out.println("Lựa chọn sai. Vui lòng chọn lại từ 1 đến 3!.");
                    break;
            }
            if(choice == 3){
                System.out.println("Hẹn gặp lại.");
                break;
            }
        }
    }
}
