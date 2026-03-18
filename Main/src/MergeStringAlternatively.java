public class MergeStringAlternatively {
    public String mergeAlternatelySolution(String word1, String word2) {
        StringBuilder a = new StringBuilder();

        int n1 = word1.length();
        int n2 = word2.length();
        int minLength = Math.min(n1, n2);

        for(int i=0; i<minLength; i++)
        {
            a.append(word1.charAt(i));
            a.append(word2.charAt(i));
        }

        if(n1>n2) {
            a.append(word1.substring(minLength));
        } else {
            a.append(word2.substring(minLength));
        }

        return a.toString();
    }
}
