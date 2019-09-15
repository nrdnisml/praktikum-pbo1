package tgs_js_3.koperasi;

public class Anggota1841720060Nurudin {
    private int mNoKTP,mJmlPinjaman,mLimitPinjaman,mPinjam;
    private String mNama;

    public Anggota1841720060Nurudin(int noKtp,String nama, int limitPinjaman) {
        mNoKTP = noKtp;
        mNama = nama;
        mLimitPinjaman = limitPinjaman;
    }
    public int getNoKTPNurudin(){
        return mNoKTP;
    } 
    public String getNamaNurudin(){
        return mNama;
    }
    public int getLimitPinjamanNurudin(){
        return mLimitPinjaman;
    }
    public int getJumlahPinjaman(){
         return mJmlPinjaman;
    }
    public void pinjamNurudin(int pinjam){
        mPinjam = pinjam;
        if (mPinjam>mLimitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        }else{
            mJmlPinjaman+=mPinjam;
        }
    }
    public void angsurNurudin(int bayar){
        mJmlPinjaman -= bayar;
    }
}