1518. Water Bottles
Solved
Easy
Topics
Companies
Hint
There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

 

Example 1:


Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
Example 2:


Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
Number of water bottles you can drink: 15 + 3 + 1 = 19.


class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        int cur_empty = numBottles;

        while (cur_empty / numExchange != 0) {
            int full_drinked = cur_empty / numExchange;
            int left_empty = cur_empty - full_drinked * numExchange;
            res += full_drinked;
            cur_empty = left_empty + full_drinked;
        }

        return res;
    }
}
  
