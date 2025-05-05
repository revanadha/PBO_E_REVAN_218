import Perpustakaan.Anggota;
import Perpustakaan.Buku;
import Perpustakaan.Fiksi;
import Perpustakaan.Nonfiksi;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Nonfiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        buku1.displayInfo();
        buku2.displayInfo();

        System.out.println();

        Anggota anggota1 = new Anggota("Revansa Adha Dwi Yuliarto", "E218");
        Anggota anggota2 = new Anggota("Aulia Rahmi", "E216");

        System.out.println();

        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        System.out.println();

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}
