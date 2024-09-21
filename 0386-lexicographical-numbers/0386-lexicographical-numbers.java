class Solution {
    public void helper(int k, int n, List<Integer> list){
        if(k > n) return;
        list.add(k);
        for(int i=0; i<=9; i++){
            int x = 10*k + i;
            if(x > n) return;
            helper(x, n, list);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList();
        for(int i=1; i<=9; i++){
            helper(i, n, ans);
        }
        return ans;
    }
}