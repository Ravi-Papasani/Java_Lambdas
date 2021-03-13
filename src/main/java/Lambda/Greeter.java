package Lambda;

public class Greeter {

/*    public void greet(){
        System.out.println("Hello World");
    }*/

    public void greeting(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter grt = new Greeter();
        //grt.greet();

        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        grt.greeting(helloWorldGreeting);


        //Calling the MyLambda Interface to implement Lambda Expression i.e void lam
        MyLambda myLambdaFunction = () -> System.out.println("implement MyLambda Interface");

        //Signature of the function matches the interface method of Greeting i.e void perform
        Greeting myGreetFunction = () -> System.out.println("implement Greeting Interface");

        //Comment and uncomment the 'add' interface method of Greeting i.e int add
        //if we want to write in Lambda expression, functional interface allows only one method
        Greeting test = () -> System.out.println("implement only single method in Interface i.e functional interface");

        //implement Lambda Expression
        MyAdd myAddFunction = (int a, int b) -> a + b;
        System.out.println(myAddFunction.add(2,3));



        // created a new class to implement to Greeting interface and provided logic in that HelloWorldGreeting class
        Greeting helloworldGreeting = new HelloWorldGreeting();
        //Lambda expression(which is an actual void function) is behaving as implementation of Greeting interface
        Greeting lambdaGreeting = () -> System.out.println("implement Greeting Interface"); //inline lambda expression
        //Anonymous Inner class
        Greeting innerclassGreeting = new Greeting() {
            public void perform() {
                System.out.println("InnerClass Hello World");
            }
        };

        helloworldGreeting.perform();
        lambdaGreeting.perform();
        innerclassGreeting.perform();
        System.out.println("Passing the Greeting objects to greeting method");
        grt.greeting(helloworldGreeting);
        grt.greeting(lambdaGreeting); //passing reference
        grt.greeting(() -> System.out.println("implement inline TypeInference")); //using inline argument
        grt.greeting(innerclassGreeting);

    }

    interface MyLambda {
        void lam();
    }

    interface MyAdd{
        int add(int c, int d);
    }
}
