// Interface for all payment methods
interface PaymentGateway {
    void pay(double amount);

    default void printReceipt() {
        System.out.println("Receipt printed by PaymentGateway.");
    }

    static void gatewayInfo() {
        System.out.println("Welcome to SecurePay Gateway System.");
    }
}

// Another interface for refund support
interface Refundable {
    void refund(double amount);
}

// CreditCard implements both interfaces
class CreditCard implements PaymentGateway, Refundable {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }

    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to Credit Card.");
    }
}

// UPI implements only PaymentGateway
class UPI implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }

    // Override default method
    public void printReceipt() {
        System.out.println("Receipt emailed for UPI payment.");
    }
}

// Wallet class with extra method
class Wallet implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }

    public void checkBalance() {
        System.out.println("Wallet balance is ₹5000.");
    }
}

// Test class
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentGateway.gatewayInfo(); // static method

        System.out.println();
        
        PaymentGateway p1 = new CreditCard();
        p1.pay(2500);
        p1.printReceipt();

        System.out.println();

        PaymentGateway p2 = new UPI();
        p2.pay(600);
        p2.printReceipt();

        System.out.println();

        Wallet wallet = new Wallet();
        wallet.pay(1000);
        wallet.checkBalance();
    }
}
