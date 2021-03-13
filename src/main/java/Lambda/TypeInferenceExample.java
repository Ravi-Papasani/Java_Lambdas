package Lambda;

public class TypeInferenceExample {
    public static void main(String[] args) {
      //StringLengthLambda myLambdalen = (String str) -> str.length();
      //StringLengthLambda myLambdalen = (str) -> str.length();
      StringLengthLambda myLambdalen = str -> str.length();
      System.out.println(myLambdalen.getLength("Hello Lambda"));


        //Calling printLambda using TypeInference depends on StringLengthLambda interface method implementation
        printLambda(str -> str.length());
    }

    public static void printLambda(StringLengthLambda stl){
        System.out.println(stl.getLength("Hello Print Lambda"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
