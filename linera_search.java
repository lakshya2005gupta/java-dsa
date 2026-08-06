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
        
}

public class linera_search{
    public static void main(String[] args) {
        int [][] arr = {{3, 5, 7, 8, },{4,8,9,23},{90,18,392,55}};
        System.out.println(liner.twoD(arr));


    }
}