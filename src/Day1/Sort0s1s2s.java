package Day1;

import java.util.Scanner;

public class Sort0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++)
            arr[i] = sc.nextInt();
        sortTheArray(arr);
        for(int val: arr)
            System.out.print(val+" ");
    }

    private static void sortTheArray(int[] nums){
        //brute force: use any sorting algorithm O(nlogn)

        //optimised approach: use counting sort O(n)

        //optimal approach: dutch national flag algorithm
        int low =0;
        int mid =0;
        int high = nums.length-1;
        //divide the arr into three parts
        //if num ==0, increment low and mid
        //else if num ==1, increment mid
        //else decrement high
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
                mid++;
            else {
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
