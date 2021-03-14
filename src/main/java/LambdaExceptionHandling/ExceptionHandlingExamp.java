package LambdaExceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExamp {
    public static void main(String[] args) {
        int [] arrNumbers = {1,2,3,4};
        //int key = 2;
        int key = 0;

        //performAddKeyToNumbers(arrNumbers, key, (num, k) -> System.out.println(num+k));

        performAddKeyToNumbers(arrNumbers, key, (num, k) -> {
            try{
            System.out.println(num/k);
            }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurred");
            }
        });
    }

    //Below method implementation using BiConsumer Interface Function
    private static void performAddKeyToNumbers(int[] arrNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int number : arrNumbers){
            biConsumer.accept(number,key);
        }
    }

   /* private static void performAddKeyToNumbers(int[] arrNumbers, int key) {
        for (int number : arrNumbers){
            System.out.println(number+key);
        }
    }*/
}
