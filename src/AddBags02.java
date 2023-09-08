import java.util.Scanner;

public class AddBags02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceAbove20 = Double.parseDouble(scanner.nextLine());
        double baggageKg = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int bags = Integer.parseInt(scanner.nextLine());

        double price = 0;


        if (baggageKg < 10) { // < под 10 кг
            price = priceAbove20 * 0.2;
        } else if (baggageKg <= 20) { // 10 - 20 кг вкл.
            price = priceAbove20 / 2;
        } else { // над 20 кг
            price = priceAbove20;
        }
        double priceTotal = 0;

        if (days > 30) {
            priceTotal = price + (price * 0.1);
        } else if (days >= 7) {
            priceTotal = price + (price * 0.15);
        } else {
            priceTotal = price + (price * 0.4);
        }
        double total = priceTotal * bags;
        System.out.printf("The total price of bags is: %.2f lv.", total);
    }
}
