import java.io.Console;
import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        int[] count2 = count.clone();

        for (int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            System.out.println(Arrays.toString(count2));
            count[t.charAt(i) - 'a']--;
        }

        for(int cnt: count) {
            if (cnt!=0)
                return false;
        }
        return true;
    }
}
