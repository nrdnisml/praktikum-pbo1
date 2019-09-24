package jobsheet04.percobaan2;

public class Mobil1841720060Nurudin {
    private String mNama;
    private int mBiaya;

    public Mobil1841720060Nurudin() {
    }
    public void setMerkNurudin(String nama){
        mNama = nama;
    }
    public String getMerkNurudin(){
        return mNama;
    }
    public void setBiayaNurudin(int biaya){
        mBiaya = biaya;
    }
    public int getBiayaNurudin(){
        return mBiaya;
    }
    public int hitungBiayaMobilNurudin(int hari){
        return mBiaya * hari;
    }
}