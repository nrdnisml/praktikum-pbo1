package jobsheet04.percobaan2;

public class Pelanggan1841720060Nurudin {
    
    private String mNama;
    private int mHari;
    private Mobil1841720060Nurudin mobil;
    private Sopir1841720060Nurudin sopir;
    
    public Pelanggan1841720060Nurudin() {
    }
    public void setNamaNurudin(String nama){
        mNama = nama;
    }
    public String getNamaNurudin(){
        return mNama;
    }
    public void setHariNurudin(int hari){
        mHari = hari;
    }
    public int getHariNurudin(){
        return mHari;
    }
    public void setMobilNurudin(Mobil1841720060Nurudin mobil){
        this.mobil=mobil;
    }
    public Mobil1841720060Nurudin getMobilNurudin(){
        return mobil;
    }
    public void setSopirNurudin(Sopir1841720060Nurudin sopir){
        this.sopir = sopir;
    }
    public Sopir1841720060Nurudin getSopirNurudin(){
        return sopir;
    }
    public int hitungBiayaTotalNurudin(){
        return mobil.hitungBiayaMobilNurudin(mHari)+
        sopir.hitungBiayaSopir(mHari);
    }
}