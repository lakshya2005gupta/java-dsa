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
static int twoD(int [][] arr){
    int minnum = arr[0][0];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] < minnum){
                minnum = arr[i][j];
            }
            
        }
        
    }
    return minnum;
}
static int odd(int [] arr){
     int count = 0;
    for (int i = 0; i < arr.length; i++) {
        int temp = arr[i] ;
        int digitcount = 0;
        while ( temp > 0) {
            temp = temp/10;
            digitcount ++;

        }
    
        if ( digitcount % 2 != 0){
            count ++;
        }       
    }
return count;
}
        
}

public class linera_search{
    public static void main(String[] args) {
        int []arr = {333, 555, 5, 3,};
        System.out.println(liner.odd(arr));


    }
}