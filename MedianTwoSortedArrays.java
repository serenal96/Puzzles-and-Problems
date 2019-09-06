/*There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5*/


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int median=0;
        ArrayList<Integer> s = new ArrayList<Integer>(); 
        boolean checkforodd=true;
        if((nums1.length+nums2.length)%2==0)
            checkforodd=false;
        while(i<nums1.length)
        {
          s.add(nums1[i]);   
          i++;
        }
        i=0;
        while(i<nums2.length)
        {
            s.add(nums2[i]);
            i++;
        }
        Collections.sort(s);
        if(checkforodd==true)
        {
            median=(nums1.length+nums2.length+1)/2;
                return s.get(median-1);
        }

        else
        {
            median=(nums1.length+nums2.length)/2;
            //System.out.println(s.get(median-1));
        return (double)(s.get(median-1)+s.get(median))/2;
            }
    }
}