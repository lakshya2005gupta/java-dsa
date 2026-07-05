import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("entre the counting upto  ");
        int cnt = input.nextInt();
        int i = 0;
        for ( ;i<= cnt ; i++){
            if ( i%2 == 0){
                System.out.println("the even numbers are ");
                System.out.println(i);
            }
            else {
                System.out.println("the odd numbers are ");
                System.out.println(i);
            }
        }    
        
    }
}
// isme maine single loop ka use kara hai thats why aisa output aa 
// rah ahai agar mujhe poora ek line me chaye to i need to use 2 
// loops one for odd and one for even not like this if i need to
//  put all in one loop then i need to use arrays  