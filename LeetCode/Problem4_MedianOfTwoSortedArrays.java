package LeetCode;

/*
*   @author
*   Pranjal Tripathi
*   Problem 4
*/

public class Problem4_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int o = (n+m)/2;
        double m1 = 0;
        double m2 = 0;
        boolean moreelement = true;
        int i = 0;
        int j = 0;
        int k = -1;
        while(moreelement) {
        if(i<n && j<m && nums1[i]<nums2[j]) {
            k++;
            m2 = m1;
            m1 = nums1[i++];
        }else if(j<m){
            k++;
            m2 = m1;
            m1 = nums2[j++];
        }else if(i<n) {
            k++;
            m2 = m1;
            m1 = nums1[i++];
        }
            if(k == o) {
            moreelement = false;
            }
        }
        
        return ((n+m)%2==0?(m1+m2)/2:m1);
               
    }
}
