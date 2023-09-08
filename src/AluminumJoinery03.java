import java.util.Objects;
import java.util.Scanner;

public class AluminumJoinery03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int joineryNum = Integer.parseInt(scanner.nextLine());
        String dimensionsOfTheJoinery = scanner.nextLine();
        String withDeliveryWithoutDelivery = scanner.nextLine();

        double price = 0.0;

        if(joineryNum<10){
            System.out.println("Invalid order");
        }
        else if(Objects.equals(dimensionsOfTheJoinery, "90X130") || Objects.equals(dimensionsOfTheJoinery, "100X150") || Objects.equals(dimensionsOfTheJoinery, "130X180") || Objects.equals(dimensionsOfTheJoinery, "200X300")) {
            if (!dimensionsOfTheJoinery.equals("90X130")) {
                if (!dimensionsOfTheJoinery.equals("100X150")) {
                    if (dimensionsOfTheJoinery.equals("130X180")) {
                        price = 190;
                        if (joineryNum >= 20 && joineryNum <= 50) {
                            price *= 0.93;
                        } else if (joineryNum > 50) {
                            price *= 0.88;
                        }
                    } else if (dimensionsOfTheJoinery.equals("200X300")) {
                        price = 250;
                        if (joineryNum >= 25 && joineryNum <= 50) {
                            price *= 0.91;
                        } else if (joineryNum > 50) {
                            price *= 0.86;
                        }
                    }
                } else {
                    price = 140;
                    if (joineryNum >= 40 && joineryNum <= 80) {
                        price *= 0.94;
                    } else if (joineryNum > 80) {
                        price *= 0.9;
                    }
                }
            } else {
                price = 110;
                if (joineryNum > 30 && joineryNum <= 60) {
                    price *= 0.95;
                } else if (joineryNum > 60) {
                    price *= 0.92;
                }
            }
            price *= joineryNum;
            if (withDeliveryWithoutDelivery.equals("With delivery")) {
                price += 60;
            }
            if (joineryNum > 99) {
                price *= 0.96;
            }
            String formatPrice = String.format("%.2f",price);
            System.out.println(formatPrice+" BGN");
        }
    }
}
