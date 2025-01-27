package ie.atu.lambda;

class ToUpperCase implements StringOperation {
    @Override
    public String apply(String input) {
        return input.toUpperCase(); // Convert input string to uppercase
    }
}
