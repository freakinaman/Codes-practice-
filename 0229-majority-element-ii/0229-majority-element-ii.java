class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>(); 
       // list.add(); 
        int i,j,c, l=nums.length;
        for(i=0;i<l;i++)
        {
            c=0;
            for(j=0;j<l;j++)
            {
                if(nums[i]==nums[j])
                    c++;
            }
            if(c>l/3 && list.contains(nums[i])==false)
                list.add(nums[i]);
        }
        return list;
    }
}