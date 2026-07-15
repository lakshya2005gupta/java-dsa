class Solution {
    
    static void swap ( int []arr , int index1 , int index2 ){
        int temp = arr[index1];
        arr[index1] = arr [index2];
        arr[index2] = temp;
    }
    public int[] concatWithReverse(int[] nums) {
        int []ans = new int[2*nums.length];
        int []rev = nums.clone();
        int start = 0;
        int end = nums.length-1;
        while (start < end){
            Solution.swap (rev , start, end);
            start++;
            end --;

        }
    for (int i = 0 ; i < nums.length ; i++){
        ans[i]= nums[i];
        ans[ i + nums.length] = rev [i];
    }
    return ans;

    }

        
        
    
}