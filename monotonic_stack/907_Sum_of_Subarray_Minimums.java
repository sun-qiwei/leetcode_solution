class Solution {
    public int sumSubarrayMins(int[] arr) {
        double M = 1e9+7;
        int length = arr.length;
        double sum = 0;
        int[] pre = new int[length]; 
        int[] next = new int[length];
        Arrays.fill(pre,-1 );
        Arrays.fill(next,length);
        Stack<Integer> s  = new Stack<>(); 
    
        for(int i = 0 ; i < length; i++){
            while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
                next[s.pop()]  = i;
            }
            s.push(i);
        }
        
        s  = new Stack<>(); 
        
        for(int i = length-1 ; i > -1; i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                pre[s.pop()]  = i;
            }
            s.push(i);
        }
        
        for(int i = 0 ; i< length;i++){
            sum += (((next[i]-i)*(i-pre[i]))%M)*arr[i]%(M);
        }
       
           return (int)(sum%M);
        }
  
}
