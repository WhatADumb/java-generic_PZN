package study.java.generic.App;

import study.java.generic.Person;
import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] person = {
            new Person("Fadhil", "Indonesia"),
            new Person("Aziz", "Indonesia"),
            new Person("Budi", "Indonesia")
        };

        Arrays.sort(person);

        System.out.println(Arrays.toString(person));
    }
}
