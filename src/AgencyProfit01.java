import java.util.Scanner;

public class AgencyProfit01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        int ticketsAdultNumber = Integer.parseInt(scanner.nextLine());
        int ticketsChildNumber = Integer.parseInt(scanner.nextLine());
        double oneTicketsToAdult = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double percent = 20/100.0;

        double oneTicketsToChild = oneTicketsToAdult-(oneTicketsToAdult*(70/100.0));
        double taxAndOneTicketsToAdult = oneTicketsToAdult+tax;
        double taxAndOneTicketsToChild = oneTicketsToChild+tax;

        double totalSumForEveryTickets = (ticketsChildNumber*taxAndOneTicketsToChild)+(ticketsAdultNumber*taxAndOneTicketsToAdult);
        double finalWin = totalSumForEveryTickets*percent;

        String formatFinalWin = String.format("%.2f",finalWin);

        System.out.println("The profit of your agency from " + companyName + " tickets is " + formatFinalWin + " lv.");

    }
}
