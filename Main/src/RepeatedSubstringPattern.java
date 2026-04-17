/*
* Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.



Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:

Input: s = "aba"
Output: false
Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.


Constraints:

1 <= s.length <= 104
s consists of lowercase English letters
* */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        // using for loop to loop thru each characters of the string for half the length of the string
        for(int i = 1; i <= n/2; i++)
            // using if condition to check whether the length is even,
            if(s.length() % i == 0) {
                // if even fetch it as pattern
                String pattern = s.substring(0, i);

                // using string builder to store the characters as string
                StringBuilder sb = new StringBuilder();

                // checking if the pattern is same till the index value from for loop
                int repeats = n/i;

                // using nested for loop to check whether the pattern is available within the repeat value
                for (int j=0; j<repeats; j++) {
                    sb.append(pattern);
                }

                if(sb.toString().equals(s))
                    return true;
            }
        return false;
    }
}
