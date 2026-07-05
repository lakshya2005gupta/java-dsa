import java.util.*;

class sum {
    static int add (int a,int b) {
        int c = a +b ;
        return c;

    }
}
public class methods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number ");
        int d = sc.nextInt();
        System.out.print("enter the second number ");
        int e = sc.nextInt();
        System.out.println(sum.add (d,e)); 
        sc.close();

    }
}
    
