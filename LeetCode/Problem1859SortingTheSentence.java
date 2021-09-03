package LeetCode;

public class Problem1859SortingTheSentence {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] temp = new String[arr.length];
        String res = "";
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            int index = arr[i].charAt(arr[i].length()-1)-'0';
            temp[index-1] = arr[i].substring(0, arr[i].length() - 1);
        }
        
        for(int i = 0; i < temp.length; i++) {
            res = res + temp[i] + " ";
        }
        return res.trim();
        
    }
}
