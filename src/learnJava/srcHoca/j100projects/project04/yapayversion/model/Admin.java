package learnJava.srcHoca.j100projects.project04.yapayversion.model;

public class Admin {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";
    
    private String username;
    private String password;

    public Admin() {
        this.username = ADMIN_USERNAME;
        this.password = ADMIN_PASSWORD;
    }

    public boolean checkCredentials(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
