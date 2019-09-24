package jobsheet04.percobaan2;

public class Sopir1841720060Nurudin {
    private String mNama;
    private int mBiaya;

    public Sopir1841720060Nurudin() {
    }
    public void setNamaNurudin(String nama){
        mNama = nama;
    }
    public String getNamaNurudin(){
        return mNama;
    }
    public void setBiayaNurudin(int biaya){
        mBiaya = biaya;
    }
    public int getBiayaNurudin(){
        return mBiaya;
    }
    public int hitungBiayaSopir(int hari){
        return mBiaya*hari;
    }
}