public class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            j = i;
            sum = 0;
            while (j < nums.length) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}