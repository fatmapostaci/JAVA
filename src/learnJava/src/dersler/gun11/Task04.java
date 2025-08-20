package learnJava.src.dersler.gun11;

public class Task04 {
                 /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
              */


    public static void main(String[] args) {
        String name = "cemal yanıyor kanlıca";

        int firstIdx = name.trim().indexOf(" "); // 5
        int lastIdx = name.trim().lastIndexOf(" "); // 5

        String adIlk = name.substring(0,1).toUpperCase();
        String adGerisi =name.substring(1,firstIdx);

        if (firstIdx == lastIdx) {
            String soyisimIlk = name.substring(firstIdx +1,firstIdx +2).toUpperCase();
            String soyisimGerisi = name.substring(firstIdx +2);
            System.out.println(adIlk.concat(adGerisi) + " " + soyisimIlk.concat(soyisimGerisi));
        } else {
            String ekisimIlk = name.substring(firstIdx + 1, firstIdx + 2).toUpperCase();
            String ekisimGerisi = name.substring(firstIdx + 2, lastIdx);

            String soyIsimIlk3 = name.substring(lastIdx + 1, lastIdx + 2).toUpperCase();
            String soyIsimGerisi3 = name.substring(lastIdx + 2);
            System.out.println(adIlk.concat(adGerisi) + " " + ekisimIlk.concat(ekisimGerisi) + " " + soyIsimIlk3.concat(soyIsimGerisi3));
        }
            // 2. Yol:

        if (name.trim().split(" ").length == 2) {
            String ilk = name.trim().split(" ")[0];
            String ikinci = name.trim().split(" ")[1];
            ilk = ilk.substring(0,1).toUpperCase().concat(ilk.substring(1).toLowerCase()); // ilk kelimeyi düzenledik -> ilk harf büyük takip edenler küçük
            ikinci = ikinci.substring(0,1).toUpperCase().concat(ikinci.substring(1).toLowerCase()); // ikinci kelimeyi düzenledik -> ilk harf büyük takip edenler küçük
            System.out.println(ilk + " " + ikinci);
        } else {
            String ilk = name.trim().split(" ")[0];
            String ikinci = name.trim().split(" ")[1];
            String ucuncu = name.trim().split(" ")[2];
            ilk = ilk.substring(0, 1).toUpperCase().concat(ilk.substring(1).toLowerCase()); // ilk kelimeyi düzenledik -> ilk harf büyük takip edenler küçük
            ikinci = ikinci.substring(0, 1).toUpperCase().concat(ikinci.substring(1).toLowerCase()); // ikinci kelimeyi düzenledik -> ilk harf büyük takip edenler küçük
            ucuncu = ucuncu.substring(0, 1).toUpperCase().concat(ucuncu.substring(1).toLowerCase()); // üçüncü kelimeyi düzenledik -> ilk harf büyük takip edenler küçük
            System.out.println(ilk + " " + ikinci+ " "+ ucuncu);

        }}
}
