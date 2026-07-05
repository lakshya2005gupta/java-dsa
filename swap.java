import java.util.*;
class mix{
    static void grape(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
class arrays {
    static int[] mango() {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the lenght of the string ");
        int len = inp.nextInt();
        int []prr = new int[len];
        for (int i = 0; i < len; i++) {
            prr[i]= inp.nextInt();
        }
        inp.close();
        return prr;
    }
}

public class swap{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = arrays.mango();
        System.out.println("enter the index of the 1st element to swap");
        int index1 = input.nextInt();
        System.out.println("enter the index of the 2nd element to swap" );
        int index2 = input.nextInt();
      
        mix.grape(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
        input.close();
    }

static void reverse (int [] arr){
    int start = 0;
    int end = arr.length -1;
    while (start < end) {
        mix.grape(arr, start , end);
        start++;    
        end--;  
    }
}


}