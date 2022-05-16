class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map numberMap = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < nums.length;i++){
            int num = nums[i];
            if(numberMap.get(num)!=null){
                return true;
            }
            else{
                numberMap.put(num,1);
            }
        }
       
        return false;
        
    }
    
}
