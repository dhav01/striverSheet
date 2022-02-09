package Day1;

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int arr[]  = new int[size];
        for (int i=0;i<size;i++)
            arr[i] = sc.nextInt();

    }

    public void getMaximumSum(int[] nums){
        //brute force: use recursion to calculate maximum sum

        //optimised approach: use kadane's algorithm

        int currentSum = nums[0];
        int maxSum = nums[0];
        int size = nums.length;

        for(int i = 0;i<size;i++){
            if(currentSum>=0)
                currentSum += nums[i];
            else
                currentSum = nums[i];
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println(maxSum);
    }
}
