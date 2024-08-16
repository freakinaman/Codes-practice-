class Solution {
    public int maxDistance(List<List<Integer>> arr) {

        int maxDiff = Integer.MIN_VALUE;
        
        int small = arr.get(0).get(0);
        int larg = arr.get(0).get(arr.get(0).size()-1);


        System.out.println(small + "   " + larg);
        
        for(int i =1 ; i<arr.size() ; i++){

            int fd = Math.abs(arr.get(i).get(arr.get(i).size()-1) - small );
            int ld = Math.abs(larg -arr.get(i).get(0) );

            int d=(fd>ld)?fd:ld; 

            maxDiff = Math.max(maxDiff,d);

            small = Math.min(arr.get(i).get(0) , small);
            larg = Math.max(larg ,arr.get(i).get(arr.get(i).size()-1) );

        }
        
        
        return maxDiff;
        
    }
}