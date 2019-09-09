package tugas_js_1;

public class HewanTernak1841720060Nurudin {
    private String mNamaHewan,mJnsHewan,mHabitat,mStatusJual;
    private int mJmlHewan,mUsia,mJmlKaki,mUsiaJual;
    
    public void inputNamaHewanNurudin(String NewValue){
        mNamaHewan = NewValue;
    }
    
    public int inputKakiNurudin(int newValue){
        return mJmlKaki = newValue;
    }
    
    public void usiaTernakNurudin(int NewValue){
        mUsia = NewValue;
    }
    
    public String familyTernakNurudin(){
        if (mJmlKaki == 2) {
            mJnsHewan = "Jenis Hewan : Unggas";
        } else if (mJmlKaki == 4 ) {
            mJnsHewan = "Jenis Hewan : Mamalia";
        } else if (mJmlKaki == 0) {
            mJnsHewan = "Jenis Hewan : Ikan";
        } else 
            mJnsHewan = "Bukan Hewan Ternak !";
        return mJnsHewan;
    }
    
    public String waktuPenjualanNurudin(){
        mUsiaJual = 3;
        mUsiaJual -= mUsia;
        if (mUsiaJual <= 0) {
            mStatusJual="Sudah siap jual!";
        }else           
            mStatusJual="Usia (siap jual) kurang "+ mUsiaJual +" bulan!";
        return mStatusJual;
    }
    
    public void cetakStatusNurudin(){
        System.out.println("============== INFORMASI HEWAN ==============");
        System.out.println("Nama Hewan : "+ mNamaHewan);
        System.out.println(familyTernakNurudin());
        System.out.println("Usia hewan sekarang : "+mUsia+" bulan");
        System.out.println(waktuPenjualanNurudin());
    }
}
