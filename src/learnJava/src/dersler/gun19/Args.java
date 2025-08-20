package learnJava.src.dersler.gun19;

public class Args {
    public static void main(String[] args) {
        Args obj = new Args();
        System.out.println("obj.toplam_args(2,3) = " + obj.toplam_args(2, 3));
        System.out.println("obj.deneme_args(1,2,3,4) = " + obj.toplam_args(1, 2, 3, 4));
        System.out.println("obj.uzunluk_args(3,4,67,8,6) = " + obj.uzunluk_args(3, 4, 67, 8, 6));
        System.out.println("obj.toplam_args(2.3,3.3) = " + obj.toplam_args(2.3, 3.3));

    }
    int toplam_args(double a,int... args){
        int sum=0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
    int uzunluk_args(int... args){
        return args.length;
    }
    double toplam_args(double... args){
        double sum=0.0;
        for (double i : args) {
            sum+=i;
        }
        return sum;
    }
}

