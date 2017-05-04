public class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        if(nums==null || nums.length<2 || k<0) return count; // 绝对差 k>0 吧
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>(); // 用过
        if(k>0){
            for(int i:nums){
                set1.add(i);
            }
            for(int j: nums){
                if(!set2.contains(j) && set1.contains(j+k)){
                    count++;
                    set2.add(j);
                }
            }
        }else{
            for(int n:nums){
                if(set1.contains(n) && !set2.contains(n)){
                    count++;
                    set2.add(n);
                }else{
                    set1.add(n);
                }
            }
        }
        return count;
    }
}