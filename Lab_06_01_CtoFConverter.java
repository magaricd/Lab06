import java.util.Scanner;

public class Lab_06_01_CtoFConverter {
    public static void main(String[] args) throws Exception {
        double tempCelsius = 0;
        double tempFahrenheit = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("what is your temperature in celsius?: ");
        if(in.hasNextDouble()){ //Checks to see if value entered is applicable
        tempCelsius = in.nextDouble();
        tempFahrenheit = (tempCelsius*1.8)+32;
        System.out.println("Youre equivalent in fahrenheit is: "+tempFahrenheit);
        }
        else{
            System.out.println("Temperature invalid"); //Displays if value entered is non-applicable
        }
        

        
    }
}
