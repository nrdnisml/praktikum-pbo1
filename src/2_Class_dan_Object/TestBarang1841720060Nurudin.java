package jobsheet02;

public class TestBarang1841720060Nurudin {
    public static void main(String[] args) {
        Barang1841720060Nurudin brg1= new Barang1841720060Nurudin();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangNurudin();
        System.out.println("Stok Baru adalah "+brg1.tambahStokNurudin(20));
    }
}
