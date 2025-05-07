package com.praktikum.users;

public abstract class User {
    private String nama = "Revansa Adha Dwi Yuliarto";
    private String nim = "202410370110218";

    // Constructor untuk inisialisasi nama dan nim
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter dan setter untuk atribut nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk atribut nim
    public String getNim() {
        return nim;
    }
    //s
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Method login() yang akan dioverride oleh subclass
    public boolean login(String inputNama, String inputNim) {
        return false;
    }

    // Method untuk menampilkan informasi pengguna
    public void displayInfo() {
        System.out.println("NAMA:"+nama);
        System.out.println("NIM : " + nim);
    }

    public abstract void info();




    public abstract void displayAppMenu();
}