package LambdaMethodReferences;

import LambdaExamples.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExam1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Sha",60),
                new Person("Lewis","Cooper",43),
                new Person("Thomas","Justin",52),
                new Person("Chris","Morris",45),
                new Person("Kevin","Calvin",54)
        );

        // create a method that prints all elements in the list
        performConditionally(people, p -> true, p -> System.out.println(p));


        // calling method using method reference
        performConditionally(people, p -> true, System.out::println); // p -> method(p)



    }
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person: people){
            if(predicate.test(person)){
                consumer.accept(person);
            }
        }
    }
}
