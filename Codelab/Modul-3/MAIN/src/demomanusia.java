class manusia {
    String nama;
    String alamat;
    int umur;


    public manusia(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        System.out.println("nama saya = " + nama + "alamat = " + alamat + "umur = " + umur);
    }
}

class mahasiswa extends manusia{
    int nim;

    public mahasiswa(String nama, String alamat, int umur, int nim) {
        super(nama, alamat, umur);
        this.nim = nim;
    }
    public void cetak(){
        System.out.println("nama = " + nama + "alamat " + alamat + "nim"+nim,"alamat" + alamat;

}

public class demomanusia{
        public static void main(String[] args){
            manusia obj = new manusia ("rudi","malang",20);
            obj.cetak();
}



















//    public manusia(String malang, String number) {
//
//    }
//
//    public void cetak(){
//   }
//}
//
//public class demomanusia{
//    public static void main (String[] args){
//
//        manusia obj = new manusia("malang","30");
//
    }
}
