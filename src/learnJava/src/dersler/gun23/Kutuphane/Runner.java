package learnJava.src.dersler.gun23.Kutuphane;

public class Runner {
    // Senaryo 1: Kitap Kulübü Yönetimi
    // Bir kitap kulübünüz var. Üyelerin adlarını bir listeye eklemeniz,
    // bazı üyeleri çıkarmanız, belirli bir üyeyi kontrol etmeniz ve
    // alfabetik olarak sıralamanız gerekiyor.

        /*
         3 classdan oluşan biy yapı oluşturalım
         1--> Runner  --> Sadeye menu() methodunu çağıralım

         2--> Menu    --> Kullanıcıya yapmak istediği işlemleri soralım.
         -- Listeye üye ekleme (add)
         -- Listeden uye silme (remove)
         -- Uye kontrolu (contains)
         -- Sıralı tum uye listesi (sort and sout)
         -- çıkıs
         3--> Islemler  --> İlgili menu işlemlerinin methodları burada tutulacak.
        */
        public static void main(String[] args) {
            Menu.menu();
        }
}
