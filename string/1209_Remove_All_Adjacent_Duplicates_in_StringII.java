class Pair{
    char letter;
    int count;
    Pair(char letter,int count){
        this.letter = letter;
        this.count = count;
    }
   
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
       
        for(int i=0 ; i < s.length(); i ++){
            
            if(!stack.empty()&&stack.peek().letter==s.charAt(i)){
                stack.peek().count = stack.peek().count+1;
                if(stack.peek().count==k){
                    stack.pop();    
                }
            }
            else{
                Pair p = new Pair(s.charAt(i),1);
                stack.push(p);   
            }
                    
            
            
        }
        
        while(!stack.empty()  ){
            Pair temp = stack.pop();
            for(int i = 0 ; i < temp.count; i++){
                result.append(temp.letter);
            }
         
        }
        return result.reverse().toString();
    }
}
