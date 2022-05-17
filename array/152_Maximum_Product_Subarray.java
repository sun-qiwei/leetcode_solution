class Solution {
    public int maxProduct(int[] nums) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        int result = 1 ;
        
        for(int i=0;i < nums.length;i++){
            if(nums[i]==0){
             
                result*=nums[i];
                results.add(result);
                result = 1 ;  
            }
            else {
               
                result*=nums[i];
                results.add(result);  
            }
                
        }
        result = 1 ;
        for(int i = nums.length-1;i>=0;i--){
           if(nums[i]==0){
                
                result*=nums[i];
                results.add(result);
                result = 1 ;  
            }
            else {  
                result*=nums[i];
                results.add(result);  
            }
        }
        Collections.sort(results);
    
        return results.get(results.size()-1);
    }
}
