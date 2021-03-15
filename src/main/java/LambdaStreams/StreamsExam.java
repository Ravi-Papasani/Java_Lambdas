package LambdaStreams;

import LambdaExamples.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExam {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Sha",60),
                new Person("Lewis","Cooper",43),
                new Person("Thomas","Justin",52),
                new Person("Chris","Morris",45),
                new Person("Kevin","Calvin",54)
        );

        people.stream()
                .filter(person -> person.getLastName().startsWith("C"))
                .forEach(person -> System.out.println(person.getFirstName()));


        Stream<Person> stream = people.stream();
        System.out.println(stream);


        // Sequential search pattern stream
        long count = people.stream()
                .filter(person -> person.getLastName().startsWith("C"))
                .count();
        System.out.println("Count person's LastName starts with 'C' " + count);

        // Parallel search pattern stream
        long parallelCount = people.parallelStream()
                .filter(person -> person.getLastName().startsWith("C"))
                .count();
        System.out.println("Count person's LastName starts with 'C' " + parallelCount);


    }
}
