class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> nums=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            nums.add(i);
            fact=fact*i;
        }
        nums.add(n);
        String ans="";
        k=k-1;
        while(true){
            ans=ans+nums.get(k/fact);
            nums.remove(k/fact);
            if(nums.size()==0){
                break;
            }
            
            k=k%fact;
            fact=fact/nums.size();
        }
        return ans;
    }
}