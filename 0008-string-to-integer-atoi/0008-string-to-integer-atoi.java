class Solution {
    public int myAtoi(String s) {
        int sign=1,len=s.length(),i;
        long num=0;
        if(len==0)
            return 0;
        for(i=0;i<len && s.charAt(i)==' ';i++);
        if(i==len)return 0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            if(s.charAt(i)=='-')
                sign=-1;
            i++;
        }
        if(i<len && (s.charAt(i)<'0' || s.charAt(i)>'9'))
            return 0;
        for(;i<len && s.charAt(i)>='0' && s.charAt(i)<='9';i++){
            num=num*10+(int)s.charAt(i)-(int)'0';
            if(num*sign>(long)Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if(num*sign<(long)Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        num=num*sign;
        if(num>(long)Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(num<(long)Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else return (int)num;
    }
}