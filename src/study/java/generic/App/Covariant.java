package study.java.generic.App;

import study.java.generic.MyData;

public class Covariant {
    public static void main(String[] args) {
        MyData<String> valData = new MyData<String>("Jack");
        process(valData);

        MyData<? extends Object> sampleData = valData;
    }

    public static void process(MyData<? extends Object> data) {
        System.out.println(data.getData());
    }
}
