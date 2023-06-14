package study.java.generic.App;

import study.java.generic.MyData;

public class Contravariant {
    public static void main(String[] args) {
        MyData<Object> objData = new MyData<Object>("Sample");
        process(objData);

        System.out.println(objData.getData());
    }

    public static void process(MyData<? super String> data) {
        Object value = data.getData();
        System.out.println("Paramater " + value + ", procceed");

        data.setData("Final Value");
    }
}
