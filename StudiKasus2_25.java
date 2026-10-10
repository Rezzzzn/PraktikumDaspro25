
import java.util.Scanner;

public class StudiKasus2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama mahasiswa :");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA / BAKORMA / MANDIRI / MANDIRI / PKM / LAINNYA ) :");
        String jenisKegiatan = sc.nextLine();
        System.out.print("Masukan jumlah dokumen :");
        int jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat Juara :");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4 ){
                    System.out.print("Status : Dokumen lengkap. Dana penghargaan diberikan");
                }else{
                    int kurang = 4 - jumlahDokumen;
                    System.out.print("Status: Dokumen tidak lengkap. (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            }
        }
    }
}
