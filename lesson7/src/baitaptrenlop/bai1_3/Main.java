package baitaptrenlop.bai1_3;

public class Main {
    public static void main(String[] args) {
        Animal []animal = new Animal[3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Bird();
        for (Animal a : animal) {
            a.makeSound();
        }

    }
}
