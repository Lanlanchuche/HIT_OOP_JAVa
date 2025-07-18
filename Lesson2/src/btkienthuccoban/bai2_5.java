package btkienthuccoban;

public class bai2_5 {
    public static void main(String[] args) {
        //viet bang for
        for (int i = 1; i <= 10; i++) {
            System.out.println("5*" + i +" = " + (5 * i));
        }
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0){
                System.out.print(j + "   ");
            }
        }
        System.out.println();
        // viet bang while
        int i = 1;
        while (i <= 10){
            System.out.println("5*" + i +" = " + (5 * i));
            i++;
        }
        int j = 1;
        while (j >= 1 && j <= 100){
            if (j % 2 == 0){
                System.out.print(j + "   ");
            }
            j++;
        }
    }
}
