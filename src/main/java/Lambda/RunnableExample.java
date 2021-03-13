package Lambda;

public class RunnableExample {
    public static void main(String[] args) {
        // Rather creating an anonymous inner class, we created a lambda for Runnable instance and all that a Thread class expects is a Runnable instance/object
        //This works because Runnable has a single method(Interface single abstract method), if it had more than one method, we could not written/implement it using lambda function.
        Thread mythread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable method");
            }
        });

        mythread.run();


        Thread myLambdaThread = new Thread(() -> System.out.println("inline Lambda Runnable")); //implementing the run method using lambda
        myLambdaThread.run();
    }
}
