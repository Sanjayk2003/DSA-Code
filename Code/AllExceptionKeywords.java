import java.io.*;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);}}
public class AllExceptionKeywords {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote!");
        } else {
            System.out.println("You are eligible to vote.");}}
    public static void main(String[] args) {
        try {
            checkAge(15);
            int a = 10 / 0;
            System.out.println("This line won't execute due to exception.");} 
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());} 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");} 
        finally {
            System.out.println("Program execution completed (finally block).");}}}
