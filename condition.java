import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        if (age<18)  {
            System.out.println("you are not eligible to give vote");
        }else{
            System.out.println("you are eligible to give vote\n choose whome to vote\n 1. BJB \n 2. INC\n 3. AAP");
            int vote = sc.nextInt();
            if (vote == 1) {
                System.out.println("you have succesafully voted for BJP");
            }else{
                if (vote == 2) {
                    System.err.println("pappu ko vote dega sharam nai aa rahi koi ni your vote is transfered to BJP");   
                } else { System.err.println("Sasti sharab ke chakkar me hai sattu na piya jaa raha tujhpe ");

                }

                }
            }
        }

    }
        

