import java.util.Scanner;

public class FindIndexOfTheFirstOccurenceInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hayStack = sc.nextLine();

        String needle = sc.nextLine();

        int index = strStr(hayStack, needle);
        System.out.println(index);
    }

    public static int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
