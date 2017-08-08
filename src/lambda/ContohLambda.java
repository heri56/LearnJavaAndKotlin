package lambda;

public class ContohLambda {
    public static void main(String args[]) {
        ContohLambda contohLambda = new ContohLambda();

        MathOperation add = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + contohLambda.operate(10, 5, add));
    }

    interface MathOperation {
        int operasi(int a, int b);
    }

    private double operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operasi(a, b);
    }
}
