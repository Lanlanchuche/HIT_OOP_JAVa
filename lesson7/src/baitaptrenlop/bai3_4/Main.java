package baitaptrenlop.bai3_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Playable> list = new ArrayList<>();
        list.add(new Piano());
        list.add(new Guitar());
        for(Playable p : list){
            p.play();
        }
    }
}
