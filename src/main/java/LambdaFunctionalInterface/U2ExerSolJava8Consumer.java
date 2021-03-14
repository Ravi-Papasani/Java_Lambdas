package LambdaFunctionalInterface;

import LambdaExamples.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class U2ExerSolJava8Consumer {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Sha",60),
                new Person("Lewis","Cooper",43),
                new Person("Thomas","Justin",52),
                new Person("Chris","Morris",45),
                new Person("Kevin","Calvin",54)
        );

        // Step 1 : Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: create a method that prints all elements in the list
        performConditionally(people, p -> true, p -> System.out.println(p));

        // Note: We are not creating Interface here separately, Writing Lambda expression using function interface(supports default one abstract method implementation)
        // Step 3: create a method that prints all the person lastname starts with 'C'
        System.out.println("Person LastName starts with XX");
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        // Step 4: create a method that prints all the person firstname starts with 'C'
        System.out.println("Person FirstName starts with XX");
        performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));

    }
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person: people){
            if(predicate.test(person)){
               consumer.accept(person);
            }
        }
    }
}
