package learnJava.src.dersler.gun19;

public class Task05_HM_Methodlar {

    /**
     * @param s
     * @return
     */
    public boolean islemKabulEdildi(String s) {
        String operator = operatoru_bul(s);
        if (operator.equals("+") ||
                operator.equals("*") ||
                operator.equals("/") ||
                operator.equals("-"))
            return true;
        else return false;
    }

    public String operatoru_bul(String s) {
        String o = s.replaceAll("\\w", "").replaceAll("[.]","");
        if(o.length()>1)
            Task05_HM.menu();

        return o;
    }

    public double[] sayiları_bul(String s) {
        double sayi1=0,sayi2=0;
       try {
           sayi1 = Double.parseDouble(s.split("[+*/-]")[0]);
           sayi2 = Double.parseDouble(s.split("[+*/-]")[1]);
       }
       catch (Exception e) {
           Task05_HM.menu();
       }
        return new double[]{sayi1, sayi2};
    }

    public double toplama_yap(double... args) {
        double result = 0.0;
        for (double i : args) {
            result += i;
        }
        return result;
    }

    public double cikarma_yap(double... args) {
        double result = args[0]+args[0];
        for (double i : args) {
            result -= i;
        }
        return result;
    }

    public double carpma_yap(double... args) {
        double result = 1.0;
        for (double i : args) {
            result *= i;
        }
        return result;
    }

    public double bolme_yap(double... args) {
        double result = 0.0;
        for (double i : args) {
            if (i == 0)
                result = 0.0;
        }
        if (args.length == 2) {
            if (args[0] > args[1]) {
                result = args[0] / args[1];
            } else if (args[1] > args[0]) {
                result = args[1] / args[0];
            }
            else Task05_HM.menu();
        }
        return result;
    }

    public double hata() {
        Task05_HM.menu();
        return 0;
    }
}
