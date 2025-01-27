package ie.atu.testpackage;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = new Addition();
        System.out.println("Addition: " + addition.operate(5, 3));
    }
}
