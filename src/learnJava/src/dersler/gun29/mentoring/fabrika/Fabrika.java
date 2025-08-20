package learnJava.src.dersler.gun29.mentoring.fabrika;

import java.time.LocalDate;

public class Fabrika {

    public static void main(String[] args) {
        Corap socketCorap = new Corap();
        Corap tenisCorabi = new Corap(10,38,"beyaz", LocalDate.of(2024,10,10), true);
        Corap yunCorap = new Corap(40,"Siyah");

        System.out.println(socketCorap.toString("Socket "));
        System.out.println(tenisCorabi.toString("Tenis "));
        System.out.println(yunCorap.toString("Yün "));

    }
}
