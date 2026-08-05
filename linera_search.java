class liner{

    static int min( int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] < temp){
                temp = arr[i];
            }
        
            }
        return temp;    
    }

        
}

public class linera_search{
    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 8, 4 ,-1 };
        System.out.println(liner.min(arr));


    }
}