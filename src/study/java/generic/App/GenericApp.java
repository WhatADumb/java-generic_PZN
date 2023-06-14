package study.java.generic.App;

import study.java.generic.MyData;

public class GenericApp {
    public static void main(String[] args) {
        MyData<String> stringData = new MyData<String>("Fadhil");
        MyData<Integer> intData = new MyData<Integer>(100);

        System.out.println(stringData.getData());
        System.out.println(intData.getData());
    }
}
