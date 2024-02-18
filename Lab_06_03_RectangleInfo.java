import java.util.Scanner;

public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) throws Exception {
        double rectLength = 0;//used to store the length of the rectangle
        double rectWidth = 0;//used to store the width of the rectangle 
        double rectHypo = 0;//used to store the hypotenuse of the rectangle
        double rectPerim = 0;//used to store the perimeter of the rectangle
        double rectArea = 0;// used to store the area of the rectangle

        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of your rectangle?: ");
       if(in.hasNextDouble()){//checks if input is valid
        rectLength = in.nextDouble();
       }
       else{//runs if input is invalid
        System.out.println("invalid value");
        }
        System.out.print("What is the width of your rectangle?: ");
       if(in.hasNextDouble()){//checks if input is valid
        rectWidth = in.nextDouble();
       }
       else{//runs if input is invalid
        System.out.println("invalid value");
       }
       rectPerim = (2*rectLength) + (2*rectWidth);//calculates the perimeter of the rectangle
       rectArea = rectLength *rectWidth;//calculates the area of the rectangle
       rectHypo = (rectLength*rectLength) + (rectWidth*rectWidth); //I'm not sure if there is a command to find the square of a number
       

       System.out.println("The perimeter of your rectangle is: "+rectPerim);//displays the value stored in rectPerim
       System.out.println("The area of your rectangle is: "+rectArea);//displays the value stored in rectArea
       System.out.println("The diagonal of your rectangle is the square root of : "+rectHypo);//displays the value stored in rectHypo

    }
}
