class Solution {
    List<List<Integer>>ans = new ArrayList<>();
    void solve(int idx,int target,int [] arr, List<Integer>help){
        if(target == 0){
            ans.add(new ArrayList<>(help));
            return;
        }
        if(idx >= arr.length){
            return;
        }
        for(int i=idx; i<arr.length && arr[i]<=target; i++){
            if(i != idx && arr[i] == arr[i-1]) continue;
                help.add(arr[i]);
                solve(i+1,target-arr[i],arr,help);
                help.remove(help.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(0,target, candidates, new ArrayList<>());
        return ans;
    }
}