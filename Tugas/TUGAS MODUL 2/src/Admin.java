public class Admin {
    private String username = "admin218";
    private String password = "password218";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }




    public void displayInfo() {
    }
}
