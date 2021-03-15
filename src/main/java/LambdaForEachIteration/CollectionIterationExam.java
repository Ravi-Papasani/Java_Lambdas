package LambdaForEachIteration;

import LambdaExamples.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExam {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Sha",60),
                new Person("Lewis","Cooper",43),
                new Person("Thomas","Justin",52),
                new Person("Chris","Morris",45),
                new Person("Kevin","Calvin",54)
        );

        System.out.println("Using for loop");
        for (int i=0; i< people.size(); i++){
            System.out.println(people.get(i));
        }

        System.out.println("Using for in/for each loop");
        for (Person person : people){
            System.out.println(person);
        }

        System.out.println("Using Java8 Lambda Expression");
        people.forEach(person -> System.out.println(person));

        System.out.println("Using Java8 Lambda Method Reference");
        people.forEach(System.out::println);
    }
}
