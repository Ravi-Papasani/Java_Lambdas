package LambdaThisReference;

import LambdaClosures.ClosureExam.Process;

public class ThisReferenceExam {

    public static void main(String[] args) {
        ThisReferenceExam thisReferenceExam = new ThisReferenceExam();
        thisReferenceExam.execute();

        //using Lambda
        thisReferenceExam.doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            //System.out.println(this);// this will not work in Lambda
        });

        // using Anonymous inner class
        thisReferenceExam.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is " + i);
                System.out.println(this);
            }
        });
    }

    public void execute(){
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);
        });

    }

    public  void doProcess(int i, Process p){
        p.process(i);
    }
}
