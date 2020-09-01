import java.awt.image.CropImageFilter;
import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {

        Circle circ= new Circle();
        Scanner in= new Scanner(System.in);

        System.out.println("Enter a radius length:");
        circ.setRadius(in.nextDouble());//call to Circle class to set radius with user input

        System.out.println("Enter x center coordinate:");
        String x= in.next();
        System.out.println("Enter y center coordinate:");
        String y= in.next();
        circ.setCenter(x,y);//call to Circle class, sets center point

        System.out.println("The area is "+ circ.computeArea()+ " units^2");

    }
}
