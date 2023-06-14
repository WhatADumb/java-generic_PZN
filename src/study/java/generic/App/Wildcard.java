package study.java.generic.App;

import study.java.generic.MyData;
import study.java.generic.App.MultipeConstraint.VicePresident;

public class Wildcard {
    public static void main(String[] args) {
        printLength(new MyData<Integer>(100));
        printLength(new MyData<Float>(20.453F));
        printLength(new MyData<Boolean>(false));
        printLength(new MyData<VicePresident>(new VicePresident()));
    }

    public static void printLength(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
