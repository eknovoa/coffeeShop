import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class RegisterMachine {
    private double amount = 0.00d;
    private Dictionary<Integer, Double> menu = new Hashtable<>();


    //Constructor
    public RegisterMachine() {}

    public void loadMenuItems() {
        menu.put(1, 1.25);
        menu.put(2, 1.50);
        menu.put(3, 2.00);
        menu.put(4, 2.75);
        menu.put(5, 2.50);
        menu.put(6, 3.25);
        menu.put(7, 3.50);

        menu.put(8, 4.00);
        menu.put(9, 4.00);
        menu.put(10, 3.75);
        menu.put(11, 2.25);
        menu.put(12, 3.00);

        menu.put(13, 4.75);
        menu.put(14, 4.75);
        menu.put(15, 3.75);
        menu.put(16, 3.25);
        menu.put(17, 4.00);
    }
    public void printMenu() {
        System.out.println();
        System.out.println("Lola's Menu");
        System.out.println("--------------------------");
        System.out.println("[ COFFEE ]");
        System.out.println(
                "(1)  Drip Brew\t\t\t\t$1.25\n(2)  American\t\t\t\t$1.50\n(3)  Cortado\t\t\t\t$2.00\n(4)  Cold Brew\t\t\t\t$2.75\n(5)  Kyoto Cold Brew\t\t$2.50\n(6)  Nitro Cold Brew\t\t$3.25\n(7)  Dirty Chai Latte\t\t$3.50\n"
        );
        System.out.println();
        System.out.println("[ NON-COFFEE ]");
        System.out.println("(8)  Chocolate Frappe\t\t$4.00\n(9)  Strawberry Smoothie\t$4.00\n(10) Chai Tea latte\t\t\t$3.75\n(11) Black Tea\t\t\t\t$2.25\n(12) Lemonade\t\t\t\t$3.00\n");
        System.out.println();
        System.out.println("[ FOOD ]");
        System.out.println("(13) Chocolate Croissant\t$4.75\n(14) Almond Croissant\t\t$4.75\n(15) Butter Croissant\t\t$3.75\n(16) Chocolate Chip Cookie\t$3.25\n(17) Blueberry Lemon Scone\t$4.00\n");
    }

    public void setAmount(Double amt) {
        amount += amt;
    }

    public double getAmount() {
        return amount;
    }

    public void startOrder() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What would like to order (enter number): ");
        int item = scnr.nextInt();
        if (item >= 1 && item <= 17) {
            setAmount(menu.get(item));
        } else {
            System.out.println("Please enter a correct menu item number 1 - 17.");
        }
    }

    public void printTotal() {
        System.out.println("Thank you for shopping with us! Your total is $" + getAmount());
    }
}
