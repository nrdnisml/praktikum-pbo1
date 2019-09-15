package tgs_js_3.koperasi.koperasi_angsur10prsn;

public class TestKoperasi1841720060Nurudin {

    public static void main(String[] args) {
        Anggota1841720060Nurudin tono = new Anggota1841720060Nurudin(123456789, "Tono", 500000);
        int bayar,pinjam;
        
        System.out.println("Nama\t: " + tono.getNamaNurudin());
        System.out.println("No KTP\t: " + tono.getNoKTPNurudin());
        System.out.println("Limit Pinjaman : " + tono.getLimitPinjamanNurudin());

        System.out.println("");
        System.out.println("Pinjam uang 1.000.000");
        tono.pinjamNurudin(1000000);
        System.out.println("");

        System.out.println("Pinjam 200.000");
        tono.pinjamNurudin(200000);
        System.out.println("Jumlah Pinjaman : " + tono.getJumlahPinjaman() + "\n");

        System.out.println("Membayar angsuran 5.000");
        tono.angsurNurudin(5000);
        System.out.println("Jumlah Pinjaman : " + tono.getJumlahPinjaman() + "\n");

        System.out.println("Membayar angsuran 50.000");
        tono.angsurNurudin(50000);
        System.out.println("Jumlah Pinjaman : " + tono.getJumlahPinjaman() + "\n");
    }
}
