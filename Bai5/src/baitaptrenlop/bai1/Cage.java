package baitaptrenlop.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cage {

    public static final int MAX_CAPACITY = 3;

    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;
    public static int totalCages = 0;

    public Cage() {
        pets = new ArrayList<>();
        totalCages++;
    }

    public Cage(String cageCode, ArrayList<Pet> pets, int currentPetCount) {
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = currentPetCount;
        totalCages++;
    }

    public void addPet(Pet p) {
        if(currentPetCount<MAX_CAPACITY) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten:");
            p.setName(sc.nextLine());
            System.out.println("Nhap can nang:");
            p.setWeight(sc.nextDouble());
            sc.nextLine();
            System.out.println("Nhap loai:");
            p.setSpecies(sc.nextLine());
            pets.add(p);
            currentPetCount++;
        }
        else {
            System.out.println("Long da day");
        }
    }
    public void printAllPet(){
        for (Pet pet:pets){
            pet.printInfor();
        }
    }
}
