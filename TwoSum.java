/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index[]={0,0},diff,j=0;
        for(int i=0;i<nums.length;i++)
        {
            index[0]=i;
            diff=target-nums[i];
            j=0;
            while(j<nums.length)
            {
                if(nums[j]==diff&&j!=i)
                {
                    index[1]=j;
                    break;
                }
            j++;
                  // System.out.println(diff);
            }
            if(index[1]>0)
                break;
    }
        return index;
    }
}