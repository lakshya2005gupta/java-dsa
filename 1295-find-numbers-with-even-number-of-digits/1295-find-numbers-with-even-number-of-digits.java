class Solution {
    public int findNumbers(int[] nums) {
        int output = 0;
        for ( int arrcount : nums){
            int temp = arrcount;
            int digitcount = 0;
            while ( temp >0){
                temp = temp /10;
                digitcount ++;

            }
            if (digitcount % 2 == 0){
                output ++ ;
            }
            
        }
        return output ;
        
    }

}