package learnJava.src.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,6,4,5,2,7,8 }; // 4 eksik
        System.out.println("Missing Number: " + findMissingNumber(nums, nums.length+1));

        findMissingNumber2(nums, nums.length + 1);
    }

    private static void findMissingNumber2(int[] nums, int n) {

        int missingN=-1;
        Arrays.sort(nums);
        for (int j = 0; j < nums.length-1; j++) {
            if (nums[j] + 1 != nums[j + 1]) {
                missingN= nums[j] + 1;
                //break;
               // return nums[j] + 1;
            }
        }
        System.out.println("missingNumber = " + missingN);
        //return -1;
    }


    private static int findMissingNumber(int[] nums, int i) {

        Arrays.sort(nums);
        int artisMiktari=nums[1]-nums[0];
        if (nums.length != i) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[j]+artisMiktari != nums[j+1]) {
                    return nums[j]+artisMiktari;
                }
            }

        }
            return -1;
    }


}
