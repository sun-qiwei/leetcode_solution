class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        if(nums.length<2){
            return null;
        }
        for(int i=0;i<nums.length-1;i++){
            int diff = target - nums[i];
            for(int j = i+1;j<nums.length;j++){
                if(diff==nums[j]){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
