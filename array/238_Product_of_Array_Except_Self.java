class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int [nums.length];
        int productTotal = 1;
        for(int i = 0; i < nums.length;i++){
            productTotal*= nums[i];
        }
        for(int i = 0; i < nums.length;i++){
            if(nums[i]!=0){
                results[i] = productTotal/nums[i];
            }
            else{
                int temp = 1;    
                for(int j = 0; j < nums.length;j++){
                    if(j!=i){
                        temp*= nums[j];                       
                    }
                }
               
                results[i] = temp;  
            }
        }
        return results;
    }
}
