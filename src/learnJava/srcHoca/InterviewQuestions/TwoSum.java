package learnJava.srcHoca.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        // Bir tamsayı dizisinde belirli bir hedef değeri oluşturan iki sayının indekslerini bulun.
        //Input:  nums = [2, 7, 11, 15], target = 9
        //Output: [0, 1]

        int[] nums = {2, 6, 11, 15, 3, 8, 1};
        int target = 9;

        List<int[]> output = twoSum(nums, target);

        ikiSayiyiTopla(nums, target);


        int[] arr = {2, 7, 11, 15, 1, 8};

        List<List<Integer>> indexlerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1; j > i; j--) {

                if (arr[i] + arr[j] == target) {
                    indexlerList.add(new ArrayList<>(List.of(i, j)));
                }
            }

        }

        System.out.println(indexlerList);

    }
public static void ikiSayiyiTopla(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                System.out.println("Indeksler: [" + i + ", " + j + "]");
            }
        }
    }
}

    public static List<int[]> twoSum(int[] nums, int target) {
        List<int[]> toplamlar = new ArrayList<>();
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    toplamlar.add(new int[]{i,j});
                }
            }
        }
        return toplamlar;
    }
}
