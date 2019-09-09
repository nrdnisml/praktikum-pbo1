package tgs_js_2;

public class SewaGame1841720060Nurudin {
    private int mId,mHarga,mWktSewa;
    private String mNamaMember,mNamaGame;
    
    public void dataSewa(int mId, String mNamaMember, String mNamaGame, int mHarga, int mWktSewa){
        this.mId = mId;
        this.mNamaMember = mNamaMember;
        this.mNamaGame = mNamaGame;
        this.mHarga = mHarga;
        this.mWktSewa = mWktSewa;
    }
    
    public int hargaSewaNurudin(){
        int bayar = mHarga * mWktSewa;
        return bayar;
    }
    
    public void cetakNurudin(){
        System.out.println("Nama\t\t: "+mNamaMember);
        System.out.println("ID\t\t: "+mId);
        System.out.println("Game\t\t: "+mNamaGame);
        System.out.println("Waktu Sewa\t: "+mWktSewa);
        System.out.println("Harga Bayar\t: Rp. "+hargaSewaNurudin());
    }
}