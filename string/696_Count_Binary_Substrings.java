class Solution {
    public int countBinarySubstrings(String s) {
        ArrayList<Integer>  groupSize = new ArrayList<>();
        groupSize.add(1);
        int index = 0;
        for(int i = 1; i < s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                groupSize.set(index,1+groupSize.get(index));
            }
            else{
                index++;
                groupSize.add(1);
            }
        }
        int count = 0;
        for(int i = 0; i < groupSize.size()-1;i++){
            count+=Math.min(groupSize.get(i),groupSize.get(i+1));
        }
        return count;
    }
}
