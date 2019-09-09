package jobsheet02;

public class Barang1841720060Nurudin {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangNurudin(){
        System.out.println("Nama Barang\t:\t"+namaBrg);
        System.out.println("Jenis Barang\t:\t"+ jenisBrg);
        System.out.println("Stok\t\t:\t"+stok);
    }
    
    public int tambahStokNurudin(int brgMasuk){
        int stokBaru=brgMasuk+stok;
        return stokBaru;
    }
}
