import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {
        double Q;
        double M;
        double initialTemperature;
        double finalTemperature;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of water in kilograms :");
        M = input.nextDouble();

        System.out.println("Enter the initial temperature :");
        initialTemperature = input.nextDouble();

        System.out.println("Enter the final temperature :");
        finalTemperature = input.nextDouble();

        Q = M * ( finalTemperature-initialTemperature)* 4184;
        System.out.println("The Energy needed :" + Q);

    }
}
