class Solution {
    public int longestConsecutive(int[] nums) {
        int l = nums.length;
        if(l==0) return 0;
        HashSet <Integer> set = new HashSet<>();
        int longest=1;
        for(int i = 0;i<l;i++){
            set.add(nums[i]);
        }
        for(int i : set)
        {
            if(!set.contains(i-1)){
                int cnt=1;
                int x =i;
                
                while(set.contains(x+1))
                {
                    x=x+1;
                    cnt=cnt+1;
                }
                longest=Math.max(longest,cnt);
            }   
        }
        return longest;
    }
}



