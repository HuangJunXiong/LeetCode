public class Solution {
    public int[] twoSum(int[] nums, int target) {
//         List<Integer> list = new ArrayList<Integer>();
//         for(int i: nums){
//             list.add(i);
//         }
//         for(int i = 0 ;i<nums.length;i++){
//             int res = target-nums[i];
//             int a = 0;
//             if (list.contains(res) && (a = list.lastIndexOf(res))!= i) {
//                 return new int[]{i,a};
//             }
//         }
//         return new int[]{0,0};
        if(nums==null || nums.length<2)
            return new int[]{0,0};
 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }
 
        return new int[]{0,0};
    }
}
