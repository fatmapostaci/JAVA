package learnJava.src.interview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    //Soru: Bir tamsayı dizisinde belirli bir hedef değeri oluşturan iki sayının indekslerini bulun.

    //Input:  nums = [2, 7, 11, 15], target = 9
    //Output: [0, 1]
    //


    public static void main(String[] args) {
        int[] nums = { 7,15, 2,1,11,8, };
        int target = 9;
        List <int[]> output = twoSum(nums, target);

        //  yazdırmanın başlangıcı
        System.out.print("[");

        for (int i = 0; i < output.size(); i++)
            System.out.print(Arrays.toString(output.get(i)));

        System.out.println("]");
        //yazdırmanın sonu
    }

    public static List<int[]> twoSum(int[] nums, int target) {
        List<int[]> toplamlarListesi = new ArrayList<>();
        int[] output;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output = new int[]{i, j};
                    toplamlarListesi.add(output);
                }
            }
        }
        return toplamlarListesi;
    }
}