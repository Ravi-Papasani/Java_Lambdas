package LambdaExceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingApproach {
    public static void main(String[] args) {
        int [] arrNumbers = {1,2,3,4};
        int key = 0;

        perform(arrNumbers, key, wrapperLambda((num, k) -> System.out.println(num/k)));
    }

    private static void perform(int[] arrNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int number : arrNumbers){
            biConsumer.accept(number,key);
        }
    }

    //Best way of handling exception is to wrap it in a method, instead using try catch to the lambda expression
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
       return (num, k) -> {
           try {
               consumer.accept(num,k);
           } catch (ArithmeticException e) {
               System.out.println("Arithmetic Exception occurred");
           }
       };
    }
}
