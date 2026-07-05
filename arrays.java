import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the lenght of the string ");
        int len = inp.nextInt();
        int []arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]= inp.nextInt();
        }
     
        System.out.println(Arrays.toString(arr));
            
        

    }
}

