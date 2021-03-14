package LambdaClosures;

public class ClosureExam {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; //Java8 int b is always treated as final, even we are not using final keyword
        //using Lambda
        doProcess(a, i -> System.out.println(i+b));

        //using Anonymous Inner class
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i+b);
            }
        });

    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }

    public interface Process{
        void process(int i);
    }
}
