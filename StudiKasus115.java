import java.util.Scanner;
public class StudiKasus115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pricePerCup = 18000; 
        int numberOfCups; 
        int payment;
        int totalPrice;
        int discount;
        int totalPayment;
        int changes;
        int minus;

        System.out.print("Enter your Number Of Cups: ");
        numberOfCups = input.nextInt();
        System.out.print("Enter your Payment: ");
        payment = input.nextInt();

        totalPrice = pricePerCup * numberOfCups;
        discount = 0;

        if (totalPrice >= 100000) {
            discount = totalPrice * 10/100; 
        } else {
            discount = 0;
        }

        totalPayment = totalPrice - discount;
            System.out.println("Total Price: " + totalPrice);
            System.out.println("Discount: " + discount);
            System.out.println("Total Payment: " + totalPayment);

        if (payment >= totalPayment) {
            changes = payment - totalPayment;
            System.out.println("Changes: " + changes);
        } else {
            minus = totalPayment - payment;
            System.out.println("Not enough money, short by RP " + minus);
        }
        
input.close();
{
    }
    }
}
