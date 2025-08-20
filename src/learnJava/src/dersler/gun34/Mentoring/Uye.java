package learnJava.src.dersler.gun34.Mentoring;

public class Uye {

    String name;//: Üye adı.

    String surname;//: Üye soyadı.

    String membershipType;//: Üye türü (“Standart”, “Premium”, “VIP”).

    double monthlyFee;//: Aylık üret.

    int monthlyUsageLimit;//: Aylık kullanım hakkı.

    int remainingUsage;//: Kullanıcının kalan hakkı.


    //Kullanıcı bilgilerini alır ve üyelik türünü kontrol ederek uygun üret ve hak tanımlarını yapar.
    public Uye(String surname, String membershipType, double monthlyFee, int monthlyUsageLimit, int remainingUsage) {
        this.surname = surname;
        this.membershipType = membershipType;
        if( membershipType.equals("Standart") ){
            this.monthlyFee = 50.0;

        }

        this.monthlyFee = monthlyFee;
        this.monthlyUsageLimit = monthlyUsageLimit;
        this.remainingUsage = remainingUsage;
    }
}
