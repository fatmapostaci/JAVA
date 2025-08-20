package learnJava.src.interview;

import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {
        Integer[] nums = {4, 3,1, 1, 5, 6, 7, 4, 6, 8};

        findDuplicates3(nums);

        findDuplicates2(nums);

        findDuplicates(nums);
    }

    private static void findDuplicates(Integer[] nums) {

        Set<Integer> tekrarsizSayilar = new LinkedHashSet<>();
        Set<Integer> tekrarliSayilar = new LinkedHashSet<>();

        for (Integer n : nums){
            //tekrarsız sayılar null iken eklemeye başlar, sayı tekrarsız sayılar listesine ekli ise else blogu çalışır
            if(!tekrarsizSayilar.contains(n))
                tekrarsizSayilar.add(n);
            else 
                tekrarliSayilar.add(n);
        }
        System.out.println("tekrarsizSayilar = " + tekrarsizSayilar);

        System.out.println("tekrarliSayilar = " + tekrarliSayilar);
    }

    private static void findDuplicates3(Integer[]nums){

        List<Integer> numsList = new ArrayList<>(List.of(nums));
        Set<Integer> numsSet = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        System.out.println("numsList before = " + numsList);

        // Iterate through the list and add to set or mark as duplicate
        for (Integer num : numsList) {
            /*
            By using Set.add(), it checks if a number already exists in the set. If it doesn’t, it’s added.
            If it returns false, it means the number is a duplicate and is added to the duplicates set.
             */
            if (!numsSet.add(num)) { // If add returns false, it's a duplicate
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates = " + duplicates);
    }

    private static void findDuplicates2(Integer[] nums) {

        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            newSet.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(newSet.contains(nums[i]))
                newSet.remove(nums[i]);
        }
        System.out.println(newSet);
   }
}
