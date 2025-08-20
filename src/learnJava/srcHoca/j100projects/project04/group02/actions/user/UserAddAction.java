package learnJava.srcHoca.j100projects.project04.group02.actions.user;


import j100projects.project04.group02.User;
import j100projects.project04.group02.UserType;
import j100projects.project04.group02.actions.Action;

import java.util.Map;
import java.util.Scanner;

public class UserAddAction extends Action {
    private Scanner scan = new Scanner(System.in);
    private final Map<String, User> usersMap;
    // Hashmap'e son eklenen kullaniciyi tutmak icin kullanilir. Kullanici yaratma isleminde otomatik login icin gerekli
    private User lastAddedUser;


    public UserAddAction(String menuName, Map<String, User> usersMap) {
        super(menuName);
        this.usersMap = usersMap;
    }

    @Override
    public void execute() {

        //UserName
        System.out.print("Lütfen kullanici adini giriniz : ");
        String userName;
        do {
            userName = scan.nextLine();
            if (usersMap.containsKey(userName)) {
                System.out.println("Var olan bir kullanici adi, lütfen yeni bir kullanici ismi deneyin !");
            } else {
                break;
            }
        } while (true);


        //Password
        System.out.print("Lütfen sifrenizi giriniz :");
        String password;
        do {
            password = scan.nextLine();
            if (password.length() < 4) {
                System.out.println("Sifre uzunlugu en az  4 karakter olmali ! Lütfen tekrar giriniz : ");
            } else {
                break;
            }
        } while (true);

        User yeniKullanici = new User(userName, password, UserType.NORMAL_USER);
        usersMap.put(userName, yeniKullanici);
        this.lastAddedUser = yeniKullanici;
    }

    public User getLastAddedUser() {
        return lastAddedUser;
    }
}