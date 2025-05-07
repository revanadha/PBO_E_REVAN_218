package com.praktikum.users;
import com.praktikum.actions.AdminActions;
import java.util.Scanner;

// Subclass Admin yang mewarisi User
public class Admin extends User implements AdminActions {
    Scanner scan = new Scanner(System.in);
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
    public void info() {
        System.out.println("Login berhasil sebagai Admin!");
    }

    @Override
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        while (true) {
            System.out.println();
            System.out.println("==== Selamat Datang Di Display App Menu Admin ====");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Masukan pilihan: ");
            int pilihMenu = scan.nextInt();

            if (pilihMenu == 1) {
                manageItems();
            } else if (pilihMenu == 2) {
                manageUsers();
            } else if (pilihMenu == 0) {
                System.out.println("Anda logout ...");
                System.exit(0);
            } else {
                System.out.println("Inputan Invalid!");
            }
        }
    }
}

























    //kunstuktor = method khusus yang di panggil saat objek dibuat
    //encapsulation = melindungi data dan menyembunyikan detail implementasi
    //inheritance = menggunakan kembai kode (extand)
    // overriding = proses membuat ulang method dan superclass di subclass (void login)
    // super keyword = memanggil konstuktor / method miilik superclass
