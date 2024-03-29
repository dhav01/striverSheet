package Day1;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
        for (int i = 0;i<size;i++)
            System.out.print(arr[i]+" ");
    }

    public static void nextPermutation(int[] nums){
        //Brute force: generate all possible permutations and return the next permutation of given array

        //optimized approach
        //1> find the index of pivot(index after which arr is decreasing)
        int pivot = indexOfPeak(nums)-1;

        //2> find the element which which is greater than the peak element
        if(pivot!=-1){
            int greater = findGreaterElement(nums,nums[pivot]);
            swap(nums,pivot,greater);
        }

        reverseArray(nums,pivot+1);
    }

    private static void reverseArray(int[] nums, int start) {
        int end = nums.length-1;
        while(start<end)
            swap(nums,start++,end--);
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private static int findGreaterElement(int[] nums, int target) {
        int j = nums.length-1;
        while(nums[j]<=target) {
            j--;
        }
        return j;
    }


    private static int indexOfPeak(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1])
                return i;
        }
        return 0;
    }
}
