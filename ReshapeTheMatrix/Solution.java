public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;
        int m = nums[0].length;
        int k =0;
        if(r*c != n*m)return nums;
        int[][] res = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++,k++){
                res[i][j] = nums[k/m][k%m];
            }
        }
        return res;
    }
}