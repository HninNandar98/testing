import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance :");
        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon:");
        double miles = input.nextDouble();

        System.out.println("Enter price per gallon:");
        double price = input.nextDouble();

        double cost = (distance * price) / miles;
        System.out.println("The cost of driving is:" + cost);
    }
}
