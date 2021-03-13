package Lambda;

@FunctionalInterface
public interface FunInterface {
   public void singleAbstractMethod();

    //void anotherMethod();
    /*Functional interface has exactly one abstract method.
    If we declare @FunctionalInterface then that interface doesn't allow to create one more abstract method.
    */

    public static void main(String[] args) {
        FunInterface myLambda = () -> System.out.println("Implement FunctionalInterface");
        myLambda.singleAbstractMethod();
    }
}
