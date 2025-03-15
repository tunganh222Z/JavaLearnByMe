package String;

import java.util.Scanner;

public class _2114_MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        _2114_MaximumNumberOfWordsFoundInSentences test = new _2114_MaximumNumberOfWordsFoundInSentences();
        int n = sc.nextInt();
        sc.nextLine();
        String[] sentences = new String[n];

        for (int i = 0; i < n; i++){
            sentences[i] = sc.nextLine();
        }
        System.out.println(test.mostWordsFound(sentences));
    }
    /*
    Example 1:
        Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
        Output: 6
    Explanation:
        - The first sentence, "alice and bob love leetcode", has 5 words in total.
        - The second sentence, "i think so too", has 4 words in total.
        - The third sentence, "this is great thanks very much", has 6 words in total.
        Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
    Example 2:
        Input: sentences = ["please wait", "continue to fight", "continue to win"]
        Output: 3
        Explanation: It is possible that multiple sentences contain the same number of words.
        In this example, the second and third sentences (underlined) have the same number of words.
     */
    public int mostWordsFound(String[] sentences) { // 3ms beats 85%
        int maximumCount = 0;
        for (String sentence : sentences){
            String[] s = sentence.split(" ");
            maximumCount = Math.max(maximumCount, s.length);
        }
        return maximumCount;
    }

    public int mostWordsFound3ms(String[] sentences) { // 3ms beats 85%
        int maximumCount = 1;
        for (String sentence : sentences){
            int count = 1;
            for (int i =0; i < sentence.length(); i++){
                if (sentence.charAt(i) == ' '){
                    count++;
                }
            }
            maximumCount = Math.max(maximumCount, count);
        }
        return maximumCount;
    }
}
