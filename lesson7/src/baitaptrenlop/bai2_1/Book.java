package baitaptrenlop.bai2_1;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tua de: ");
        title = sc.nextLine();
        System.out.println("Nhap tac gia: ");
        author = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Tua de: " + title + ", tac gia: " + author);
    }
}
