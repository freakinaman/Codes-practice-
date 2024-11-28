class Solution {
    public int missingNumber(int[] nums) {
        
        int max=0; int l= nums.length;
        int i;
        for(i = 0;i<l ; i++)
        {
            if (nums[i]>max)
                max= nums[i];
        }
        int c=0;
        
        for ( i =0 ;i < max;i++)
        {
            c=0;
            for(int j= 0 ;j< l; j++)
            {
                if(i==nums[j]) c++;
            }
            if (c==0)
                break;;
        }
        if (l==1)
        {
            if(nums[0]==0) return 1;
            if(nums[0]==1) return 0;
            
        }
        if( c==1)
            return i+1;
        
        
    return i;
    }
}


