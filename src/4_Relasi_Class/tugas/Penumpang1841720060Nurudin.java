package tgs_js_4;

public class Penumpang1841720060Nurudin {
    
    private String mKtp;
    private String mNama;

    public Penumpang1841720060Nurudin(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }
    public String getmKtpNurudin() {
        return mKtp;
    }
    public void setmKtpNurudin(String mKtp) {
        this.mKtp = mKtp;
    }
    public String getmNamaNurudin() {
        return mNama;
    }
    public void setmNamaNurudin(String mNama) {
        this.mNama = mNama;
    }
    public String infoNurudin(){
        String info = "";
        info +="\nKTP\t: "+ mKtp + "\n";
        info +="Nama\t: "+ mNama + "\n";
        return info;
    }
}