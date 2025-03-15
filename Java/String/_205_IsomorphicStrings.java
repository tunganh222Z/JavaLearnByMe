package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _205_IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        _205_IsomorphicStrings test = new _205_IsomorphicStrings();
        System.out.println(test.isIsomorphic(s, t));
    }
    /*
    Example 1:
        Input: s = "egg", t = "add"
        Output: true
    Explanation:
        The strings s and t can be made identical by:
        Mapping 'e' to 'a'.
        Mapping 'g' to 'd'.
    Example 2:
        Input: s = "foo", t = "bar"
        Output: false
    Explanation:
        The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
    Example 3:
        Input: s = "paper", t = "title"
        Output: true
     */
    public boolean isIsomorphic(String s, String t) { // 17ms beats 39%
        Map<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            if (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))) {
                return false;
            }

            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            }

            if (!map.get(s.charAt(i)).equals(t.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public boolean isIsomorphic4ms(String s, String t) {
        int n=s.length();
        if(t.length()!=n)return false;
        int[] map=new int[256];
        int[] set=new int[256];
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map[a]==0){
                if(set[b]==0){
                    map[a]=b;
                    set[b]=1;
                }else{
                    return false;
                }
            }else if(map[a]!=b){
                return false;
            }
        }
        return true;
    }
}
