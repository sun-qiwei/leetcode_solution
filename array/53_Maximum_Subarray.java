// the result space for max sum can found in set[-z][z][-z],[z][-z][z],[-z][z],[z][-z],[z] or [-z]. Such when the sum drop below 0, we drop the prefix sequence and looking 
//rest. TO do so,we can either set cumulative sum as 0 or reset sum as current value
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            if(sum>=0){
                sum += nums[i];    
            }
            else{
                sum = nums[i];
            }
            if(sum>maxSum){
                    maxSum = sum;
                 }    
        }
        return maxSum;
    }
}
