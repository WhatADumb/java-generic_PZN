package study.java.generic.App;

import study.java.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<String,String>("Fadhil", "Firmansyah");
        Pair<String, Float> pair2 = new Pair<String,Float>("Dhil", 4.00F);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
