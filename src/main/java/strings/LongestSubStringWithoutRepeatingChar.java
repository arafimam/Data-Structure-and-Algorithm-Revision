package strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChar {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        // for every character check the longest substring possible.
        char []inputString = s.toCharArray();
        if (inputString.length == 0){
            return -1;
        }
        Set<Character> characters = new HashSet<>();
        int max = 0;
        for (int i=0;i<s.length();i++){
            // for the given character at position i, find max_length
            int j = i;
            while (j<s.length() && !characters.contains(inputString[j])){
                characters.add(inputString[j]);
                j++;
            }
            if (characters.size() > max){
                max = characters.size();
            }
            characters.removeAll(characters);
        }
        return max;
    }

}
