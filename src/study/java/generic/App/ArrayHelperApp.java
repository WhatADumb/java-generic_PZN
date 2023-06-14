package study.java.generic.App;

import study.java.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Fadhil", "Firmansyah", "Dhil"};
        Integer[] values = {1,3,4,5,8};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(values));
    }
}
