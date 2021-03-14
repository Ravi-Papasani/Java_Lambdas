package LambdaExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class U1ExerSolJava8 {
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
        printConditionally(people, p -> true);

        // Note: We are not creating Interface here separately, Writing Lambda expression using function interface(supports default one abstract method implementation)
        // Step 3: create a method that prints all the person lastname starts with 'C'
        System.out.println("Person LastName starts with XX");
        printConditionally(people, p -> p.getLastName().startsWith("C"));

        // Step 4: create a method that prints all the person firstname starts with 'C'
        System.out.println("Person FirstName starts with XX");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));

    }

    private static void printConditionally(List<Person> people, U1ExerSolCondInterfaceJava7.Condition condition) {
        for (Person person: people){
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }
}
