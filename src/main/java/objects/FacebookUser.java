package objects;

public class FacebookUser {
    String username;
    String password;
    String firstName;
    String lastName;

    public void login(String username, String password){
        System.out.println(username + " logged in to the application");
    }

    public static void main(String[] args) {
        FacebookUser user = new FacebookUser();
        user.login("abc","abc123");
        user.username = "tokyo";
        user.password = "abc123";

        FacebookUser user2 = new FacebookUser();
        user2.username = " malya";
        user2.password = "2233";
        user2.login(user2.username, user2.password);

    }

}
