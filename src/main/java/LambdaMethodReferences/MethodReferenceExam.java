package LambdaMethodReferences;

public class MethodReferenceExam {
    public static void main(String[] args) {
        // Direct Method Calling
        printMessage();

        // Calling method using Lambda expression
        Thread th = new Thread(() -> printMessage());
        th.start();

        // Calling method using method reference
        Thread t = new Thread(MethodReferenceExam::printMessage); // () -> method()
        //MethodReferenceExam::printMessage === () -> printMessage()
        t.start();

    }

    public static void printMessage(){
        System.out.println("Hello Message");
    }
}
