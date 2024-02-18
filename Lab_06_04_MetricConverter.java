import java.util.Scanner;

public class Lab_06_04_MetricConverter {
    public static void main(String[] args) throws Exception {
        double meterMeasurement = 0;//Stores the value entered for meters
        double feetMeasurement = 0;//Stores the value entered for feet
        double milesMeasurement = 0;//Stores the value entered for miles
        double inchesMeasurement =0;//Stores the value entered for inches

        Scanner in = new Scanner(System.in);

        System.out.print("What is your measurement in meters?: ");
        if(in.hasNextDouble()){//checks to see if value is valid
        meterMeasurement = in.nextDouble();

        feetMeasurement = meterMeasurement * 3.281;//Divides meters by how many feet are in a meter
        inchesMeasurement = meterMeasurement * 39.37;//Divides meters by how many inches are in a meter
        milesMeasurement = meterMeasurement/1609.34;//Divides meters by how many meters are in a mile

        System.out.println("Your measurement in feet is approximately: "+feetMeasurement);//displays the value in measurementFeet
        System.out.println("Your measurement in inches is approximately: "+inchesMeasurement);//displays the value in measurementInches
        System.out.println("Your measurement in miles is approximately: "+milesMeasurement);//displays the value in measurementMiles
        }
        else{//runs if value is invalid
            System.out.println("invalid value");
        }
    }
}
