public class Mahasiswa {
    // atribut privat yg hanya bisa di akses dari dalam kelas ini saja
    private String nama = "Revansa Adha Dwi Yuliarto";
    private String nim = "202410370110218";

    //memvalidasi login mahasiswa berdasarkan nama dan NIM yang dimasukkan
    public boolean login(String inputNama, String inputNim) {
        return inputNama.trim().equalsIgnoreCase(nama.trim()) && inputNim.trim().equals(nim.trim());
    }
    //menampiilkan informasi jika berhasil
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
