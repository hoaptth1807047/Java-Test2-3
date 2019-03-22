package controller;

import entity.Category;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryController {
    private ArrayList<Category> list = new ArrayList<>();
    public void addCategory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập mã danh mục: ");
        String IDCate = scanner.nextLine();
        System.out.println("Vui lòng nhập tên danh mục: ");
        String nameCate = scanner.nextLine();
        Category cate = new Category(IDCate, nameCate);
        list.add(cate);
    }
    public void printListCate(){
        System.out.printf("%-10s %-10s\n", "Mã", "Tên danh mục");
        for (int i = 0; i < list.size() ; i++) {
            Category cate = list.get(i);
            System.out.println(cate.toString());
        }
    }
}
