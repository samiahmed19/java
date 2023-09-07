// package javacodes;

public class subsets {
    public static void powerset(String s, int index,String curr){
        int n=s.length();
        if(index==n) return;
        System.out.println(curr+" ");
        for(int i=index+1;i<n;i++){
            curr+=s.charAt(i);
            powerset(s, i, curr);
            curr= curr.substring(0, curr.length()-1);
        }
    }
    public static void main(String[] args) {
        String s="abcd";
        int index=-1;
        String curr="";
        powerset(s,index,curr);
        
    }
}
