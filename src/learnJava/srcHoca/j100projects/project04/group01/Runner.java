package learnJava.srcHoca.j100projects.project04.group01;

/**
 * The Runner class is the entry point of the application where the program starts.
 * It demonstrates the functionality of adding users to a list and executing the main menu action.
 * admin users can add regular users to a data structure.
 */
public class Runner {
    /**
     * The main method that is executed when the program is run.
     * It creates an AdminUser and RegularUser objects, adds them to a userList via the AdminUser,
     * and then calls the mainMenu action from the Action class.
     *
     * @param args Command line arguments (not used in this case).
     */
    public static void main(String[] args) {


        // Create an AdminUser object to manage users
        AdminUser adm = new AdminUser("admin","admin123123","admin@admin.com");

        // Create RegularUser objects
        RegularUser user1 = new RegularUser("asd","asdasd111","asd@asd.com");
        RegularUser user2 = new RegularUser("xcv","xcvxcv123","xcv@xcv.com");
        RegularUser ahmet = new RegularUser("ahmet","ahmet2016","ahmetpostaci16@gmail.com");

        AdminUser adm2 = new AdminUser("admin2","admin123122","admin@admin.com");

        //sadece admin referansı olan obje listeye kullanıcı ekleyebilir
        adm.addUserToHashMap(user1);
        adm.addUserToHashMap(user2);
        adm.addUserToHashMap(ahmet);
        adm.addUserToHashMap(adm);

        Action.mainMenu();


    }
}
