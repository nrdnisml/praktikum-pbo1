package tgs_js_3.koperasi.input_console;

import java.util.Scanner;
public class TestKoperasi1841720060Nurudin {

    public static void main(String[] args) {
        Anggota1841720060Nurudin tono = new Anggota1841720060Nurudin(123456789, "Tono", 500000);
        int bayar,pinjam;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Nama\t: " + tono.getNamaNurudin());
        System.out.println("No KTP\t: " + tono.getNoKTPNurudin());
        System.out.println("Limit Pinjaman : " + tono.getLimitPinjamanNurudin()+"\n");
       
        System.out.print("Masukkan nominal pinjaman : Rp.");
        pinjam = sc.nextInt();
        tono.pinjamNurudin(pinjam);
        System.out.println("Jumlah pinjaman saat ini : Rp."+tono.getJumlahPinjaman()+ "\n");
        
       do {
            System.out.println("=======================Bayar bro!=======================");
            System.out.print("Bayar angsuran : Rp. ");
            bayar = sc.nextInt();
            tono.angsurNurudin(bayar);
            System.out.println("Jumlah pinjaman saat ini : Rp."+tono.getJumlahPinjaman()+ "\n");
        } while (tono.getJumlahPinjaman()>0);
        System.out.println("Terima Kasih, Pinjaman Anda Lunas!");
    }
}