package Lambda;

public class Notes {

    /*public void greet(action){
       action();
    }*/

    //Inline Values
    String name = "foo_doo";
    double pi = 3.14;


    //Function as a value
   /*blockOfCode =  public void greet(){
        System.out.println("function as value");
    }*/


    //Above function as a value using Lambda Expression
   /* blockOfCode = () -> {
        System.out.println("function as value");
    }
    //OR
    blockOfCode = () -> System.out.println("function as value");*/



    //Functions converting into Lambda Examples

   /* //Function
    multiplyFunction = public int multiply(int x) {
        return 2 * x;
    }

    //Converting into Lambda
    multiplyFunction = (int x) -> 2 *x;


    //Function
    addFunction = public int add(int x, int y) {
        return  x + y;
    }

    //Converting into Lambda
    addFunction = (int x, int y) -> x + y;


    //Converting into Lambda
    divideFunction = (int x, int y) -> x/y;


    //Converting into Lambda
    safeDivideFunction = (int x, int y) -> {
        if(x == 0) return 0;
        return x/y;
        }

    //Converting into Lambda
    stringLengthFunction = (String s) -> s.length();
*/
    public static void main(String[] args) {

    }
}
