package tgs_js_2;

public class TestBarang1841720060Nurudin {
    public static void main(String[] args) {
        Barang1841720060Nurudin brg = new Barang1841720060Nurudin();
        brg.kode = "AR123";
        brg.namaBarang = "Coklatcoy";
        brg.hargaDasar = 12000;
        brg.diskon = 0.1;
        brg.hitungHargaJualNurudin(brg.hargaDasar, brg.diskon);
        brg.tampilDataNurudin();
    }
}
