package LeetCode;

public class Problem771JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int n = stones.length();
        int count = 0;
        for(int i = 0; i < n; i++) {
            String s = Character.toString(stones.charAt(i));
            if(jewels.contains(s)) {
                count++;
            }
        }
        return count;
        
    }
}
