package tgs_js_2;

public class Barang1841720060Nurudin {
    public String kode,namaBarang;
    public int hargaDasar;
    public double diskon;
    
    
    public int hitungHargaJualNurudin(int hargaDasar, double diskon){
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
        double hargaJualTemp = hargaDasar - diskon*hargaDasar;
        int hargaJual = (int)hargaJualTemp;
        return hargaJual;
    }
    
    public void tampilDataNurudin(){
        System.out.println("Kode Barang\t:\t"+kode);
        System.out.println("Nama Barang\t:\t"+namaBarang);
        System.out.println("Harga Awal\t:\tRp."+hargaDasar);
        System.out.println("Diskon\t\t:\t"+diskon*100+"%");
        System.out.println("Harga jual\t:\tRp. "+hitungHargaJualNurudin(hargaDasar, diskon));
    }
}