package com.praktikum.users;

import java.util.Scanner;
import com.praktikum.actions.MahasiswaActions;

public class Mahasiswa extends User implements MahasiswaActions {
    private final Scanner scan = new Scanner(System.in);

    // Constructor Mahasiswa menggunakan super constructor User
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // Override method login untuk validasi nama dan nim
    @Override
    public boolean login(String inputNama, String inputNim) {
        return this.getNama().equals(inputNama) && this.getNim().equals(inputNim);
    }

    // Override method info untuk menampilkan pesan login sukses
    @Override
    public void info() {
        System.out.println("Login Mahasiswa sukses.");
        // Abstract method 'info()' tidak boleh dipanggil via super
        // Jika ingin tampilkan info user, buat method displayInfo di superclass
    }

    // Override method manageUsers dari MahasiswaActions

    public void manageUsers() {
        System.out.println(">> Fitur Kelola Pengguna Mahasiswa Belum Tersedia <<");
    }

    // Method untuk input data barang
    @Override
    public void reportItem() {
        System.out.print("Nama Barang: ");
        String namaBarang = scan.nextLine();

        System.out.print("Deskripsi Barang: ");
        String deskripsiBarang = scan.nextLine();

        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasiBarang = scan.nextLine();

        System.out.println("==== Cetak ====");
        System.out.println("Nama Barang = " + namaBarang);
        System.out.println("Deskripsi Barang = " + deskripsiBarang);
        System.out.println("Lokasi Terakhir/Ditemukan = " + lokasiBarang);
    }

    // Method untuk lihat laporan barang
    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    // Tampilan menu untuk Mahasiswa
    @Override
    public void displayAppMenu() {
        while (true) {
            System.out.println();
            System.out.println("==== Selamat Datang Di Display App Menu Mahasiswa ====");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Masukan pilihan: ");

            int pilihMenu = scan.nextInt();
            scan.nextLine(); // ⚠️ Scanner trap fix

            switch (pilihMenu) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Anda logout ...");
                    return;
                default:
                    System.out.println("Inputan Invalid!");
            }
        }
    }
}
