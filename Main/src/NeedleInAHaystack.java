public class NeedleInAHaystack {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();

        for(int i=0; i<hlen-nlen; i++) {
            if (needle.equals(haystack.substring(i, i+nlen)))
                return i;
        }
        return -1;
    }
}
