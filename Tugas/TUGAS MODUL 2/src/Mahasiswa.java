public class Mahasiswa {
    private String nama = "Revansa Adha Dwi Yuliarto";
    private String nim = "202410370110218";

    public boolean login(String inputNama, String inputNim) {
        return inputNama.trim().equalsIgnoreCase(nama.trim()) && inputNim.trim().equals(nim.trim());
    }

    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
