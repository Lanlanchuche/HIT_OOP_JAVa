package baitapvenha.bai3;

import baitapvenha.bai2.Student;

public interface StudentManagerInterface {
    public void sortBySCoreDesc();
    public void sortByScoreAsc();
    public Student findByName(String name);
    public void printStudents();
}
