package Day1;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    public void nextPermutation(int[] nums){
        //Brute force: generate all possible permutations and return the next permutation of given array

        //optimized approach
        //1> find the index of pivot(index after which arr is decreasing)
        int pivot = indexOfPeak(nums)-1;

        //2> find the element which which is greater than the peak element
        if(pivot!=-1){
            int
        }

    }


    private int indexOfPeak(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1])
                return i;
        }
        return 0;
    }
}
