package controller;

import entity.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodController {
    private ArrayList<Food> list = new ArrayList<>();
    public void addFood(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập mã món ăn: ");
        String ID = scanner.nextLine();
        System.out.println("Vui lòng nhập tên món ăn: ");
        String name = scanner.nextLine();
        System.out.println("Vui lòng nhập mô tả ngắn: ");
        String description = scanner.nextLine();
        System.out.println("Vui lòng nhập giá: ");
        String price = scanner.nextLine();
        System.out.println("Vui lòng nhập ngày tạo: ");
        String createAt = scanner.nextLine();
        Food food = new Food(ID, name, description, price, createAt);
        list.add(food);
    }
    public void printList(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Mã", "Tên món", "Giá", "Mô tả", "Ngày phát hành");
        for (int i = 0; i < list.size() ; i++) {
            Food food = list.get(i);
            System.out.println(food.toString());
        }
    }
}
