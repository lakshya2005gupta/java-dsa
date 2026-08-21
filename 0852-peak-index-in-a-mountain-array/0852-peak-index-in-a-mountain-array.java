class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        int ans = 0; 
        while (end > start){
            int mid = start + (end - start)/2;
            if (arr[mid]< arr[mid+1]){
                start = mid+1;
            }
            else {
                end = mid;
            }
            ans = start ;
            }
            return ans;
        }
    } 
