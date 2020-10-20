package sort;
import java.util.Arrays;

//9 6 5 0 8 2 7 1
public class InsertionSort {

    public static int[] doInsertionSort(int[] nums){
        int n=nums.length;
        int i=0;
        for (int j = 1; j<n; j++) {
            i=j-1;
            int key=nums[j];
            while (i>=0 && nums[i]>key) {
                nums[i+1]=nums[i];
                i--;
            }
            nums[i+1]=key;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={2,1, 0, 8, 4};
        int[] sort = doInsertionSort(nums);
        System.out.println(Arrays.toString(sort));
    }
}
