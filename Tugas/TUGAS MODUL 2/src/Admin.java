public class Admin {
    //atribut privat yang hanya bisa di akses di dalam kelas ini saja
    private String username = "admin218";
    private String password = "password218";

    //memvalidasi login admin berdasarkan username dan password yang dimasukkan
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }




    public void displayInfo() {
    }
}
