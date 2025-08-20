package learnJava.srcHoca.j100projects.project04.group02.actions.user;

import j100projects.project04.group02.actions.Action;
import j100projects.project04.group02.User;

import java.util.Map;
import java.util.Scanner;

public class UserListAction extends Action {

    private Scanner scan = new Scanner(System.in);
    private final Map<String, User> usersMap;

    public UserListAction(String menuName, Map<String, User> usersMap) {
        super(menuName);
        this.usersMap = usersMap;
    }

    //Kullanicilari görüntüleme / Listeleme Methodu
    @Override
    public void execute() {
        System.out.println("Kayitli kullanicilar : ");
        for (String userName : usersMap.keySet()) {//Map`in icinde ki her bir elemana erismek icin
            System.out.println(userName);
        }
    }
}