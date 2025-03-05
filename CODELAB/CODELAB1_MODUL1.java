package CODELAB1_MODUL1.main;
import java.time.LocalDate;
import java.util.Scanner;

public class CODELAB1_MODUL1 {
    public static void main(String[] args){
        String name;
        char gender;
        int tahunlahir;
        Scanner objInput = new Scanner(System.in);

        System.out.print("MASUKKAN NAMA ANDA = ");
        name = objInput.nextLine();
        System.out.print("MASUKKAN JENIS KELAMIN ANDA (P/L) = ");
        gender = objInput.next().charAt(0);
        System.out.print("MASUKKAN TAHUN LAHIR ANDA = ");//revansa adha dwi yuliarto
        tahunlahir = objInput.nextInt();
        int tahunsekarang = LocalDate.now().getYear();
        int umur = tahunsekarang - tahunlahir;

        if( gender == 'L' || gender =='l'){
            System.out.print("\nData diri = \nNama     = " +name + "\nJenis kelamin = Laki-Laki \nUmur    : " + umur);
        } else if (gender == 'P'|| gender == 'p'){
            System.out.print("\nData diri = \nNama     = " +name + "\nJenis kelamin = Perempuan \nUmur   : "  + umur);
        } else {
            System.out.println("masukkan gender sesuai pilihan (P/L");
        }

    }
}
