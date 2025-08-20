package learnJava.src.interview;

public class anagramChecker {
    /*
    An anagram is a word or phrase formed by rearranging the letters of another word or phrase.
    The task is to determine if two given strings are anagrams of each other.
     String str1 = "listen";
        String str2 = "silent";
     */
    public static void main(String[] args) {
        String str1 = "çelenk";
        String str2 = "kelenç";
        boolean isAnagram = anagramCheckMethod(str1,str2) ;
        System.out.println("isAnagram = " + isAnagram);
        StringBuilder s = new StringBuilder();
        //s.co
    }

    private static boolean anagramCheckMethod(String str1, String str2) {
        if (str1.length()!=str2.length())
            return false;

        while (!str1.isEmpty()) {
             String character = String.valueOf( str2.charAt(0));
            if( str1.contains(character) ) {
                str1 = str1.replace(  character,"" );
                str2 = str2.replace(character,"");
               // System.out.println("character = " + character);
                return anagramCheckMethod(str1,str2);
            }
            else return false;

        }
        return true;
    }
}
