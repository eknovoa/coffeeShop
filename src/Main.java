import java.util.Scanner;

public class Main {

    public static void welcomeMessage() {
        System.out.println("Hello! Welcome to Lola's Coffee Shop");
        System.out.println();
        System.out.println("What can I get started for you today?");
    }

    public static void printOptions() {
        System.out.println("Type '1' - I need to see the menu.");
        System.out.println("Type '2' - Sorry, I don't want anything anymore.");
    }

    public static void main(String[] args) {
        RegisterMachine rm = new RegisterMachine();
        rm.loadMenuItems();
        Scanner scnr = new Scanner(System.in);

        welcomeMessage();
        printOptions();
        System.out.println();
        System.out.print("Enter choice: ");
        int userChoice = scnr.nextInt();

        if (userChoice == 1) {
            rm.printMenu();
            System.out.println("Are you ready to order? Type 'yes' to order or 'exit' to leave the store.");
            String orderOrExit = scnr.next();
            if (orderOrExit.equals("yes")) {
                System.out.println("Please note when ordering type in the number to the left of the menu item.");
                System.out.println("For example: If you want to order a chocolate Frappe, type 8.\n(8) Chocolate Frappe\t\t$4.00");
                System.out.println();
                System.out.println("Great! Let's get started!");

                rm.startOrder();
                System.out.println("Do you want to order more? (yes) or (no)");
                String userInput = scnr.next();

                while (userInput.equals("yes")) {
                    rm.startOrder();
                    System.out.println("Do you want to order more? (yes) or (no)");
                    userInput = scnr.next();
                }
                rm.printTotal();
            }
            else if (orderOrExit.equals("exit")) {
                System.out.println("Okay hope to see you again soon! Goodbye.");
            }
            else {
                System.out.println("Error: Invalid input! User should have typed 'yes' or 'exit'. Goodbye.");
            }
        }

        else if (userChoice == 2) {
            System.out.println("Hope to see you again soon! Goodbye.");
        } else {
            System.out.println("Error: That was not a valid choice. The user can enter 1, 2, or 3. Goodbye.");
        }

    }
}