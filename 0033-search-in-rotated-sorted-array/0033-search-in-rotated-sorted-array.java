class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        int taridx=rotatedarraysearch(nums,target,si,ei);
        return taridx;
    }
    public int rotatedarraysearch(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        //Mid==target
        if(arr[mid]==tar){
           return mid; 
        }
        //Mid on Line 1
            if(arr[si]<=arr[mid]){
                //case a: left
                if(arr[si]<=tar && tar<=arr[mid]){
                    return rotatedarraysearch(arr,tar,si,mid-1);
                }
                //case b: right
                else{
                    return rotatedarraysearch(arr,tar,mid+1,ei);
                }
            }
            //Mid on Line 2
            else{
                // case c:left
                if(arr[mid]<=tar&&tar<=arr[ei]){
                    return rotatedarraysearch(arr,tar,mid+1,ei);
                }
                //case d:right
                else{
                    return rotatedarraysearch(arr,tar,si,mid-1);
                }
            }
    }
}