package tgs_js_4;

public class Pegawai1841720060Nurudin {
    private String mNip;
    private String mNama;

    public Pegawai1841720060Nurudin(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }
    public String getNipNurudin() {
        return mNip;
    }
    public void setNipNurudin(String mNip) {
        this.mNip = mNip;
    }
    public String getNamaNurudin() {
        return mNama;
    }
    public void setNamaNurudin(String nama) {
        mNama = nama;
    }
    public String infoNurudin(){
        String info = "\n";
        info+="Nama : " + mNama+"\n";
        info+="Nip  : " + mNip;
        return info;
    }
}