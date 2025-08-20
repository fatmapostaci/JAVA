package learnJava.src.dersler.gun23.Kutuphane;

import java.util.Scanner;

public class Uye {

    int uyeId = 000;
    String uyeName;

    static Scanner scanner =new Scanner(System.in);
    public void setUye(){
        System.out.print("Uye adı girin: ");
        setUyeName(scanner.next());
        setUyeId(+1);
    }
    public int getUyeId() {
        return uyeId;
    }
    public String getUyeName(){
        return uyeName;
    }
    public void setUyeId(int uyeId) {
        this.uyeId = uyeId;
    }
    public void setUyeName(String uyeName){
        this.uyeName = uyeName;
    }
}
