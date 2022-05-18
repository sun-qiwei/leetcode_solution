//  the array is divided into two ascending order array. the left one alway biger than the right; the minimum value will be found in right one. use binary search can used in a sorted array. so we are using binary search either in left array or right array. find middle point first then findout where the middle point locat at left or right. If on the left one set left point as middle plus one.if one the right set right as middel -1;
class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int middle = len/2;
        int min = Integer.MAX_VALUE;
        while(left <= right ){
            min = Math.min(nums[middle],min);
            if(nums[left]<nums[right]){
                min = Math.min(nums[left],min);
            }
            if(nums[middle]>=nums[left]){
                left = middle+1;
                middle = (left+right)/2 ;
            }
            else{ 
                right = middle-1;
                middle = (left+right)/2 ;  
            }
        }
        return min;
         
    }
   
}
