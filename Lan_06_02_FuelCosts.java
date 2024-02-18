import java.util.Scanner;

public class Lan_06_02_FuelCosts {
    public static void main(String[] args) throws Exception {
        double gasGallons = 0;
        double gasEfficiency = 0;
        double gasPrice = 0;
        double overallEfficiency = 0;
        double overallPrice = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("How many gallons are in your car?:");
        if(in.hasNextDouble())
        {  //checks if gallon value is correct
        gasGallons = in.nextDouble();
        }
        else
        {
            System.out.println("invalid value"); //displays if gallon value is incorrect
        }

        System.out.print("How many miles to the gallon does your car have?: ");
        if(in.hasNextDouble())
        { //checks if mile value is correct
        gasEfficiency = in.nextDouble();
        }
        else
        {
            System.out.println("invalid value"); //displays if mile value is incorrect
        }

        System.out.print("How much is a gallon of gas?: ");
        if(in.hasNextDouble())
        {
            gasPrice = in.nextDouble();
        }
        else
        {
            System.out.println("invalid value");
        }

        overallEfficiency = gasGallons * gasEfficiency;
        overallPrice = gasPrice * 100;

        System.out.println("With the amount of gas in your car, you can drive up to: "+overallEfficiency + " miles");
        System.out.println("100 gallons of gas for your car would cost: "+overallPrice);

    }
}
