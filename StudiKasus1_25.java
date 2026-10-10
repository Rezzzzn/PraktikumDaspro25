
import java.util.Scanner;

/**
 * StudiKasus1_25
 */
public class StudiKasus1_25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //deklarasi variabel
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;
        
        //input
        System.out.print ("Masukan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukan uang bayar : ");
        uangBayar = sc.nextInt();

        //hitung
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >=1000000) {
            diskon = totalHarga * 10 /100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga :" + totalHarga);
        System.out.println("Diskon :" + diskon);
        System.out.println("Total Bayar :" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.print("Kembalian Rp." + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.print("Uang tidak cukup, kurang Rp." + kurang);
        } 
        sc.close();
    } 
}