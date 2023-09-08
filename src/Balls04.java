import java.util.Scanner;

import static java.lang.Math.floor;

public class Balls04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballsNum = Integer.parseInt(scanner.nextLine());

        int pointball = 0;
        int cauntball = 0;
        int colorBallRed = 0;
        int colorballOrange = 0;
        int colorBallYellow = 0;
        int colorBallWhite = 0;
        int colorBallBlack = 0;


        for (int i = 1; i <= ballsNum; i++) {
            String color = scanner.nextLine();
            if (color.equals("red")) {
                pointball += 5;
                colorBallRed += 1;
            } else if (color.equals("orange")) {
                pointball += 10;
                colorballOrange += 1;
            } else if (color.equals("yellow")) {
                pointball += 15;
                colorBallYellow += 1;
            } else if (color.equals("white")) {
                pointball += 20;
                colorBallWhite += 1;
            } else if (color.equals("black")) {
                pointball = pointball / 2;
                colorBallBlack += 1;
            } else {
                cauntball = cauntball + 1;
            }
        }


        System.out.println("Total points: " + pointball);
        System.out.println("Red balls: " + colorBallRed);
        System.out.println("Orange balls: " + colorballOrange);
        System.out.println("Yellow balls: " + colorBallYellow);
        System.out.println("White balls: " + colorBallWhite);
        System.out.println("Other colors picked: " + cauntball);
        System.out.println("Divides from black balls: " + colorBallBlack);
    }
}
