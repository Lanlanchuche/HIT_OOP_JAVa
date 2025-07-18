import java.util.Scanner;

public class Student {
    String name;
    int age;
    int mark;
    public Student() {
        name = "No Name";
        age = 0;
        mark = 0;
    }
    public Student(String n, int a, int m) {
        name = n;
        age = a;
        mark = m;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setMark(int m){
        mark = m;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getMark(){
        return mark;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int number = sc.nextInt();

        Student []arr = new Student[number];
        for (int i = 0; i < number; i++){
            arr[i] = new Student();
            System.out.println("Sinh vien thu " + (i + 1));
            System.out.print("Ten: ");
            sc.nextLine();
            arr[i].setName (sc.nextLine());
            System.out.println("Tuoi: ");
            arr[i].setAge(sc.nextInt());
            System.out.println("Diem: ");
            arr[i].setMark(sc.nextInt());

        }
        for (int i = 0; i <number; i++){
            System.out.println("Sinh vien thu " + i);
            System.out.println("Ten: " + arr[i].getName());
            System.out.println("Tuoi: " + arr[i].getAge());
            System.out.println("Diem: " + arr[i].getMark());
        }
    }
}
