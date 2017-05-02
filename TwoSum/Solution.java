public class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i: nums){
            list.add(i);
        }
        for(int i = 0 ;i<nums.length;i++){
            int res = target-nums[i];
            int a = 0;
            if (list.contains(res) && (a = list.lastIndexOf(res))!= i) {
                return new int[]{i,a};
            }
        }
        return new int[]{0,0};
    }
}