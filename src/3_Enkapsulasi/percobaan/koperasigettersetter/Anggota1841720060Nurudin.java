package jobsheet03.koperasigettersetter;

public class Anggota1841720060Nurudin {
    private String mNama,mAlamat;
    private float mSimpanan;

    Anggota1841720060Nurudin(String mNama,String mAlamat) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mSimpanan = 0;
    }
    
    
    public void setNamaNurudin(String mNama){
        this.mNama = mNama;
    }
    public void setAlamatNurudin(String mAlamat){
        this.mAlamat = mAlamat;
    }
    public String getNamaNurudin(){
        return mNama;
    }
    public String getAlamatNurudin(){
        return mAlamat;
    }
    public float getSimpananNurudin(){
        return mSimpanan;
    }
    public void setorNurudin(float uang){
        mSimpanan += uang;
    }
    public void pinjamNurudin(float uang){
        mSimpanan -= uang; 
    }
}
