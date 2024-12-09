// This is a beginner project that was coded and completed from a post by Shubhanshu Sharma on Scaler.com (https://www.scaler.com/topics/currency-converter-java-project/)
// The comments below were added by myself after completing the project. 

import java.util.Scanner; // This is necessary to store inputs from the user

public class CurrencyConverter {

    public static void main(String[] args) {

        System.out.println("Option 1: Ruppe");
        System.out.println("Option 2: Dollar");
        System.out.println("Option 3: Euro");

        Scanner sc = new Scanner(System.in); // new Scanner object
        System.out.println("Choose the currency"); // Requesting and storing input currency type
        int choice = sc.nextInt();
        System.out.println("Enter the amount"); // Requesting and storing input currency amount
        double amount = sc.nextDouble();
        sc.close(); // Added this to prevent "Scanner still open error". This was not in the
                    // original online project.

        switch (choice) { // Switch case is selected by input currency type value
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // Below are 3 separate methods for presenting and displaying the requested
    // currency conversion. They are separate in order in simplify operations in the
    // main method.

    public static void Ruppe_to_other(double amt) {
        System.out.println("1 Ruppe = " + 0.013 + " Dollar");
        System.out.println();

        System.out.println(amt + " Ruppe = " + (amt * 0.013) + " Dollar");
        System.out.println();

        System.out.println("1 Ruppe = " + 0.012 + " Euro");
        System.out.println();
        System.out.println(amt + " Ruppe = " + (amt * 0.012) + " Euro");
        System.out.println();
    }

    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 79.37 + " Ruppe");
        System.out.println();

        System.out.println(amt + " Dollar = " + (amt * 79.37) + " Ruppe");
        System.out.println();

        System.out.println("1 Dollar = " + 0.98 + " Euro");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
        System.out.println();
    }

    public static void Euro_to_other(double amt) {
        System.out.println("1 Euro = " + 80.85 + " Ruppe");
        System.out.println();

        System.out.println(amt + " Euro = " + (amt * 80.85) + " Ruppe");
        System.out.println();

        System.out.println("1 Euro = " + 1.02 + " Dollar");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
        System.out.println();
    }

}
