1051. Height Checker
Solved
Easy
Topics
Companies
Hint
A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
Example 2:

Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
Example 3:

Input: heights = [1,2,3,4,5]
Output: 0
Explanation:
heights:  [1,2,3,4,5]
expected: [1,2,3,4,5]
All indices match.



code:

class Solution {
    public int heightChecker(int[] heights) {
        int i,l=heights.length;
        int arr[]=new int [l];
        for(i=0;i<l;i++)
        {
            arr[i]=heights[i];
        }
        Arrays.sort(heights);
        int c=0;
        for(i=0;i<l;i++)
        {
            if(arr[i]!=heights[i])
            c++;
        }
        
        return c;
    }
}
