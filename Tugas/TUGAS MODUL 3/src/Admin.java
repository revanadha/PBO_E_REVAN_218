// Subclass Admin yang mewarisi User
class Admin extends User {
    private String username = "username218";
    private String password = "password218"; // en

    // Constructor Admin dengan super untuk inisialisasi User
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // Override method login untuk validasi username dan password
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // Override method displayInfo untuk menampilkan pesan login sukses
    @Override
    public void displayInfo() {
        System.out.println("Login Admin sukses. ");
    }


























    //kunstuktor = method khusus yang di panggil saat objek dibuat
    //encapsulation = melindungi data dan menyembunyikan detail implementasi
    //inheritance = menggunakan kembai kode (extand)
    // overriding = proses membuat ulang method dan superclass di subclass (void login)
    // super keyword = memanggil konstuktor / method miilik superclass
}
