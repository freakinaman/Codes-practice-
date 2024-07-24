class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {

        int len = nums.length ;

        int[] result = new int[len] ;
        int[][] map = new int[len][2] ;

        for(int i=0;i<len;i++)
        {
            int temp = nums[i] ;

            if(temp == 0)
            {
                map[i][0] = mapping[0] ;
                map[i][1] = 0 ;
            }
            else
            {
                int tempSum = 0 ;
                int power = 0 ;

                while(temp > 0)
                {
                    tempSum += mapping[temp%10]*Math.pow(10,power) ;
                    temp = (temp - temp%10)/10 ;
                    power++ ;
                }

                map[i][0] = tempSum ;
                map[i][1] = nums[i] ;
            }
        }

        Arrays.sort(map, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        for(int i=0;i<len;i++)
        {
            result[i] = map[i][1] ;
        }

        return result;
    }
}