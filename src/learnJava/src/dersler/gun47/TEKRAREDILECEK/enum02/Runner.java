package learnJava.src.dersler.gun47.TEKRAREDILECEK.enum02;

public class Runner {

    public static void main(String[] args) {

        User user1 = new User();
        user1.name = "Mehmet Bey";

        //user1.role = 0;
        user1.role = Roles.ADMIN;
        //user1.status = 0;
        user1.status = Status.ACTIVE;

        User user2 = new User();
        user2.name = "Mertay Bey";
        user2.role = Roles.CUSTOMER;
        user2.status = Status.ACTIVE;

        User user3 = new User("Tugba Hanım",Roles.CUSTOMER,Status.INPROGRESS);

        musteriBilgileriniOku(user1);
        musteriBilgileriniOku(user2);
        musteriBilgileriniOku(user3);


    }

    public static void musteriBilgileriniOku(User user){
        if (user.role.equals(Roles.ADMIN)){
            System.out.println(user.name + " admin olarak tüm datalara ulaşabilir ve güncelleyebilirsiniz");
        } else if (user.role.equals(Roles.CUSTOMER)){
            System.out.println(user.name + " customer olarak bilgilere ulaşmaya yetkiniz yok");
        }
    }
}
