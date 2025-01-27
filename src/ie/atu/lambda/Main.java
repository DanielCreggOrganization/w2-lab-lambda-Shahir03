package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        StringOperation toUpperCase = (String input) -> input.toUpperCase(); // Create instance of ToUpperCase
        String result = toUpperCase.apply("hello world!"); // Test with a string
        System.out.println("Result: " + result); // Output: HELLO WORLD!
        
        //part 3
        Runnable helloRunnable = () -> System.out.println("Hello from the thread");
        Thread thread = new Thread(helloRunnable);
        thread.start(); 

        //part 4
        Function<String, String> trimFunction = str -> str.trim();
        
        // Combine it with a lambda that converts to lowercase
        Function<String, String> combinedFunction = trimFunction.andThen(str -> str.toLowerCase());
        
        // Test the combined operation
        String input = "  Hello World!  ";
        String result = combinedFunction.apply(input);
        
        // Output the result
        System.out.println("Result: \"" + result + "\""); // Expected: "hello world!"
    }
    
}

