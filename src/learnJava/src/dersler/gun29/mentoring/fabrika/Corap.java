package learnJava.src.dersler.gun29.mentoring.fabrika;

import java.time.LocalDate;

public class Corap {
        /*
    Corap uretimi yapan bir fabrika için corap sablonu ulusturmak istiyoruz.
    Bu şablon, aşağıdaki bilgileri içermelidir:
     --> (int)       yas
     --> (double)    ayakNumarası
     --> (String)    rengi
     --> (String)    kumasCinsi
     --> (LocalDate) uretimTarihi
     --> (Boolean)   yazlıkMı
    Buna uygun bir kod üretelim.

    --> Urunun tüm özelliklerini tasıyan bir kalıp oluşturun
    --> Urunun rengi ve ayak numarasını içeren bir kalıp oluşturun.
    --> 2 corap uretip yazdırın
       */
    int yas = 0;
    double ayaknumarasi = 0.0;
    String rengi = null;
    LocalDate uretimTarihi;
    boolean yazlikMi;


    public Corap(int yas, double ayaknumarasi, String rengi, LocalDate uretimTarihi, boolean yazlikMi) {
        this.yas = yas;
        this.ayaknumarasi = ayaknumarasi;
        this.rengi = rengi;
        this.uretimTarihi = uretimTarihi;
        this.yazlikMi = yazlikMi;
    }

    public Corap() {

    }

    public Corap(double ayaknumarasi, String rengi) {
        this.ayaknumarasi = ayaknumarasi;
        this.rengi = rengi;
    }

    @Override
    public String toString() {
        return  " Corap{" +
                "yas=" + yas +
                ", ayaknumarasi=" + ayaknumarasi +
                ", rengi='" + rengi + '\'' +
                ", uretimTarihi=" + uretimTarihi +
                ", yazlikMi=" + yazlikMi +
                '}';
    }
    public String toString(String a) {
        return a+ " Corap{" +
                "yas=" + yas +
                ", ayaknumarasi=" + ayaknumarasi +
                ", rengi='" + rengi + '\'' +
                ", uretimTarihi=" + uretimTarihi +
                ", yazlikMi=" + yazlikMi +
                '}';
    }
}
