package LambdaExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class U1ExerSolJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Sha",60),
                new Person("Lewis","Cooper",43),
                new Person("Thomas","Justin",52),
                new Person("Chris","Morris",45),
                new Person("Kevin","Calvin",54)
        );

        // Step 1 : Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // Step 2: create a method that prints all elements in the list
        printAllList(people);

        // Step 3: create a method that prints all the person lastname starts with 'C'
        printAllLastNameStartsWith_C(people);
    }

    private static void printAllLastNameStartsWith_C(List<Person> people) {
        System.out.println("Person LastName starts with 'C'");
        for (Person person: people){
            if(person.getLastName().startsWith("C")){
                System.out.println(person);
            }
        }
    }

    private static void printAllList(List<Person> people) {
        for(Person person: people){
            System.out.println(person);
        }
    }
}
