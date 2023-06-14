package study.java.generic.App;

import study.java.generic.Person;
import java.util.Comparator;
import java.util.Arrays;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] person = {
            new Person("Fadhil", "Indonesia"),
            new Person("Aziz", "Indonesia"),
            new Person("Budi", "Indonesia")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(person, comparator);

        System.out.println(Arrays.toString(person));
    }
}
