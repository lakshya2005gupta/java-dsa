import java.util.*;
public class is_prime {
    public static void main(String[] args){
        Scanner prime = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = prime.nextInt();
        for (int i=2; i<=n; i++){
            if (n%i==0){
                System.out.println(n + " is not prime");
            } else {
                System.out.println(n + " is prime");
            }
        }
    }
}5