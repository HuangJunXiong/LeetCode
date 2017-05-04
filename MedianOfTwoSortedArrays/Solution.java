public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c= new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, c, 0, nums1.length);
        System.arraycopy(nums2, 0, c, nums1.length, nums2.length);
        heapSort(c); // 这里用的堆排序，快速排序会不会好点
        if(c.length == 1) return c[0];
        if(c.length == 2) return (double)(c[0] + c[1])/2;;
        if(c.length >2){
            if(c.length%2 == 0){
                return (double)(c[c.length/2] + c[c.length/2-1])/2;
            }else{
                return c[c.length/2];
            }
        }
        return 0;
    }
    private void heapSort(int[] arr) {
        // 建初始堆
        for (int i = arr.length  / 2; i >= 0; i--) {
            sift(arr, i, arr.length);
        }
        for (int i = arr.length-1 ; i > 0; i--) {
            int temp = arr[0]; // 交换位置
            arr[0] = arr[i];
            arr[i] = temp;
            sift(arr, 0, i); // 重新建堆 每次建堆少一个元素
        }
    }
    private void sift(int[] arr, int start, int size) {
        int j = 2 * start + 1; //j是i的左孩子的位置
        int temp = arr[start];
        while (j < size) {
            if (j != size-1 && arr[j] < arr[j + 1]) {   //若右孩子大，把j指向右孩子
                j++;
            }
            if (temp < arr[j]) {
                arr[start] = arr[j]; // 将arr[j]交换到双亲节点上，并修改i，j的值，以便继续筛选
                start = j;
                j = 2 * j + 1;
            } else {
                break;
            }
        }
        arr[start] = temp; //被筛选的节点的值放入最终位置
    }
}