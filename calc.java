import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner female = new Scanner(System.in);
        System.out.print("enter the operation you want to perform \n 1. sum(+) \n 2. subtact(-) \n 3. multiply(*) \n 4. devision(/) \n  5. ");  
        int num = female.nextInt();
        System.out.print("enter the first number ");
        double num1 = female.nextDouble();
        System.out.print("enter the second number ");
        double num2 = female.nextDouble();
        double a = num1+num2;
        double b = num1-num2;
        double c = num1*num2;
        double d = num1/num2;
        switch (num){
            case 1 : System.out.println("sum of " + num1 + "and " + num2 + "is " + a );
                break;
            case 2 : System.out.println("diffrence of " + num1 + "and " + num2 + "is " + b );
                break;
            case 3 : System.out.println("product of " + num1 + "and " + num2 + "is " + c );
                break;
            case 4 : System.out.println("bacha kucha of " + num1 + "and " + num2 + "is " + d );
                break;
            default : System.out.println("invalid enty" );
        }
    }
}

