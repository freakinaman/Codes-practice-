class Solution {
public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    StringBuilder temp = new StringBuilder(" ");
    int i = 0,f = 0;
    for(; i < s.length(); i++){
        if(s.charAt(i) != ' '){
            temp.append(s.charAt(i));
            f = 1;
        }
        else {
            if(f == 0) continue;
            sb.insert(0, temp);
            temp.setLength(0);
            temp.insert(0, " ");
            f = 0;
        }
    }
    if(f == 1) sb.insert(0, temp);
    sb.delete(0, 1);
    return String.valueOf(sb);
}
}