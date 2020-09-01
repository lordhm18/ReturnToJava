import java.util.Scanner;

public class ReturnToJava {
    static void dupMethod(){
        int array[]= {};
        for (int i=0; i<array.length; i++)
        { int x=array[i];
            for(int j= i+1; j<array.length; j++)
            {
                int y= array[j];
                if (x==y)
                {
                    System.out.println(x+ " is a duplicate");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Please enter a number in pounds: ");
        double pounds=in.nextDouble();
        double kg= pounds*0.453592;
        System.out.println(kg+" kg");

        System.out.print("Please enter 3 numbers: ");
        double firstNum= in.nextDouble();
        double secondNum= in.nextDouble();
        double thirdNum= in.nextDouble();

        if (firstNum>secondNum && firstNum>thirdNum)
        {System.out.println(firstNum+" is the largest");}

        else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println(secondNum+" is the largest");

        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.println(thirdNum+" is the largest");
        }


        int array[]= {1,3,4,5,5,6,7,8,9};
        for (int i=0; i<array.length; i++)
        { int x=array[i];
            for(int j= i+1; j<array.length; j++)
            {
                int y= array[j];
                if (x==y)
                {
                    System.out.println(x+ " is a duplicate");
                }
            }
        }


    }
}