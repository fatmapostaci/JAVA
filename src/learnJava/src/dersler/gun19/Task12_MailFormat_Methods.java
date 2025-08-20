package learnJava.src.dersler.gun19;

public class Task12_MailFormat_Methods {
    /*
            Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        4- com ile bittiği kontrolü
     */
    public boolean isFormatAccepted(String s) {
        if( isDotIncluded(s) &&
            isAtIncluded(s) &&
            isStringEntered(s) &&
            isComEntered(s)
        ) return true;
        else return false;
    }

    /** @ karakteri kontrolü
     * @param s mail adresi input olarak alınır
     * @return true yada false
     */
    private boolean isDotIncluded(String s){
        if (s.contains("."))
            return true;
        else return false;
    }

    /**
     * . (nokta) karakteri olmalı
     * @param s mail adresi input olarak alınır
     * @return true yada false
     */
    private boolean isAtIncluded(String s){
        if (s.contains("@"))
            return true;
         else return false;
    }

    /**
     * metin girilmesi gerektiği kontrolü
     * @param s mail adresi input olarak alınır
     * @return true yada false
     */
    private boolean isStringEntered(String s){
        int index = s.indexOf("@");
        if (index >1)
            return true;
        else return false;
    }
    private boolean isComEntered(String s){
        int index = s.indexOf(".");
        if(s.substring(index+1).contains("com"))
            return true;
        else return false;
    }

}
