package learnJava.src.dersler.gun17;

public class OCASorulari {
    public static void main(String[] args) {


        //Oracle imtihanı sorusu:
        int count = 0;
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue;
                count++;
            }
        }
        System.out.println(count);

/*

       //Soru :2

            for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.print(i + " ");
        }




        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }



/*
        //Soru :3

        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i);
                if (i == j) {
                    break;
                }
                System.out.print(i + "-" + j + " ");
            }
        }



        /*
        // AşağıdaKİ kod sonsuz döngüye girer mi?

        int count = 0;
        while (true) {
            if (count == 3) {
                break;
            }
            System.out.print(count + " ");
            count++;
        }


/*
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue;
            }


            if (i == 3) {
                break;
            }
            System.out.print(i + " ");
        }

         */
    }
}
























