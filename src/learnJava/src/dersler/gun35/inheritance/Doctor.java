package learnJava.src.dersler.gun35.inheritance;

public class Doctor extends Human {
    private boolean tus;
    private String specialization;

    public Doctor() {
    }

    public Doctor(String name, boolean tus, String specialization) {
        super(name);
        this.tus =tus;

        if (tus==true)
            this.specialization = specialization;
        else
            this.specialization = "Uzmanlık Alanı yok";
    }

    @Override
    public String introduceYourself(){
        if( specialization == null )
            this.specialization="";
        return "\nMy name is " + name + ", I work as a/an " + specialization + " doctor.";
    }

    public void setTus(boolean tus) {
        this.tus = tus;
    }

    @Override
    public String toString() {
        String tusStr ;

        //tus belgesi varsa output metnine sadece specialization yazsın
        if(tus == true) {
            return "Doctor-> "+
                    " Adı = " + name + " , " +
                    " Yaşı = " + age + " , " +
                    " Uzmanlık Alanı = " + specialization + "  ";
        }
        else{
            tusStr = "Uzmanlığı yok.";
        //Tus belgesi yok ise output Tus olmadığını yazsın
        return "Doctor-> "+
                " Adı = " + name + " , " +
                " Yaşı = " + age + " , " +
                " TUS = " + tusStr + "  " ;
        }

    }
}
