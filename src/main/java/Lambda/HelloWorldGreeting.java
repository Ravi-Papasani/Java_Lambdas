package Lambda;

public class HelloWorldGreeting implements Greeting{

    @Override
    public void perform() {
        System.out.println("HelloWorldGreeting Class!");
    }
}
