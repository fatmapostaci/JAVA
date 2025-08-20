package hesapMakinasi.ArraysQuestions;

import java.util.Arrays;

public class RepeatCountArr {
    /**
     * Array içinde birden fazla kez geçen elemanları ve bunların kaç kez geçtiğini bulur
     * @param arr
     */
    public static void repeatCountArr(int []arr) {

        Arrays.sort(arr); // Arrayi natural order da sıralar.
        System.out.println("*".repeat(30));
        for (int i = 0,a=0; i < arr.length-1 ; i++,a++) {
            int say=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    say++; //tekrar edenleri say
                }
                else { //eşit olmayan gelince dönggüyü bitir
                    i=j-1;//dıştaki for döngüsü tur biterken i 1 artacağı için 1 eksilttim
                    break;
                }
            }
            System.out.println(" \"" + arr[i] +"\" sayısı " + say + " kez tekrar eder. ");
        }
        System.out.println("*".repeat(30));
    }
}
