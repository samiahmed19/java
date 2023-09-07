// package javacodes;
import java.util.*;
public class unberry
{
	public static void main(String[] args) {
		String str1="unberry";
		String str2="colorberry";
		// int sum=0;
		// int count1=0,count2=0;
// 		System.out.println(str2.length());
		HashMap<Character,Integer> map1=new HashMap<>();
		HashMap<Character,Integer> map2=new HashMap<>();
		for(int i=0;i<str1.length();i++) map1.put(str1.charAt(i),i);
		for(int i=0;i<str2.length();i++) map2.put(str2.charAt(i),i);
		int ans=0;
		for(char c: map1.keySet()){
		    if(map2.containsKey(c)){
		        ans++;
		    }
		}
		System.out.print(ans);
	}
}
