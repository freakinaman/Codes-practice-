class Solution {
    List<List<String>> result = new ArrayList<List<String>>();
    public List<List<String>> partition(String s) {
        findAll(0, s, new ArrayList<String>());
        return result;
    }
    
    private void findAll(int start, String s, List<String> partition) {
        if (start == s.length()) {
            result.add(new ArrayList<String>(partition));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(start, end, s)) {
                partition.add(s.substring(start, end + 1));
                findAll(end + 1, s, partition);
                partition.remove(partition.size() - 1);
            }
        }        
    }
    private boolean isPalindrome(int start, int end, String s) {
        if (start >= end) return true;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}