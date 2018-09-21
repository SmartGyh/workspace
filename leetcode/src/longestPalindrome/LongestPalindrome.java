package longestPalindrome;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.nextLine();
			System.out.println(longestPalindrome(s));
		}
	}
	
	public static String longestPalindrome(String s){
		if(s.equals("")){
			return s;
		}
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		String result = "";
		char ca[] = s.toCharArray();
		for(int i = 0;i < ca.length;i++){
			if(!map.containsKey(ca[i])){
				map.put(ca[i], i);
			}else{
				int num = map.get(ca[i]);
				for(int j = num;j <= i;j++){
					 result += String.valueOf(ca[j]);
				}
				return result;
			}
		}
		return String.valueOf(s.charAt(0));
	}
	
}
