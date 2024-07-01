1550. Three Consecutive Odds
Solved
Easy
Topics
Companies
Hint
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 

Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.


code:

class Solution {
    public boolean threeConsecutiveOdds(int[] arr)
    {
        int l=arr.length,i,j,flag=0;
        for(i=0;i<l;i++)
        {   
            if(arr[i]%2==1)   //&& arr[i]+1%2==1 && arr[i+2]%2==1
            flag++;
            if(arr[i]%2==0)
            flag=0;
            if(flag==3)
            break;
        }
       if (flag==3)
       return true;
       else 
       return false;
    }
}
