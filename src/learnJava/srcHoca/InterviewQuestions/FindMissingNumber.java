package learnJava.srcHoca.InterviewQuestions;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] nums = {1,6,4,5,2,7,8 }; // 4 eksik
        System.out.println("Missing Number: " + findMissingNumber2(nums,8));

    }

    private static int findMissingNumber2(int[] nums, int n) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int counter = 0;

        for (int j = 0; j < n ; j ++ ){
            counter++;
            if (nums[j] != counter){
                return counter;
            }
        }

        return -1;
    }

    public static int findMissingNumber(int[] nums, int n) {

        int beklenenToplam = n * (n + 1) / 2;

        int mevcutToplam = 0;
        for (int sayi : nums) {
            mevcutToplam += sayi;
        }

        return beklenenToplam - mevcutToplam;
    }
}
