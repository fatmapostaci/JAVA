package learnJava.srcHoca.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 4, 6, 8};
        findDuplicates3(nums);
    }

    public static void findDuplicates(int[] nums) {
        ArrayList<Integer> tekrar = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("Tekrar eden sayılar");

        for (int i = 0; i < nums.length; i++) {

            if (tekrar.contains(nums[i])) {
                System.out.println(nums[i]);
                hs.add(nums[i]);
            } else {
                tekrar.add(nums[i]);
            }
        }
        System.out.println(hs);
    }

    public static void findDuplicates2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                System.out.println(nums[i] + " tekrar ediyor.");
            }
        }
    }
    public static void findDuplicates3(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate Numbers: " + duplicates);
    }
}

