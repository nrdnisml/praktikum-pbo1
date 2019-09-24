package tgs_js_4;

public class KeretaApi1841720060Nurudin {

    private String mNama, mKelas;
    private Pegawai1841720060Nurudin masinis;
    private Pegawai1841720060Nurudin asisten;
    public Gerbong1841720060Nurudin gerbong;

    public KeretaApi1841720060Nurudin(String mNama, String mKelas, Pegawai1841720060Nurudin masinis, 
           Pegawai1841720060Nurudin asisten,Gerbong1841720060Nurudin gerbong) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.masinis = masinis;
        this.asisten = asisten;
        this.gerbong = gerbong;
    }
    public String getNamaNurudin() {
        return mNama;
    }
    public void setNamaNurudin(String mNama) {
        this.mNama = mNama;
    }
    public String getKelasNurudin() {
        return mKelas;
    }
    public void setKelasNurudin(String mKelas) {
        this.mKelas = mKelas;
    }
    public Pegawai1841720060Nurudin getMasinisNurudin() {
        return masinis;
    }
    public void setMasinisNurudin(Pegawai1841720060Nurudin masinis) {
        this.masinis = masinis;
    }
    public Pegawai1841720060Nurudin getAsisten() {
        return asisten;
    }
    public void setAsistenNurudin(Pegawai1841720060Nurudin asisten) {
        this.asisten = asisten;
    }
  
    public String infoNurudin(){
        String info = "";
        info += "============ \tINFO KERETA\t ============\n";
        info += "KERETA\t: " + this.mNama + "\n";
        info += "KELAS\t: " + this.mKelas + "\n";
        info += "======== Masinis ========" + this.masinis.infoNurudin() + "\n";
        info += "======== Asisten ========" + this.asisten.infoNurudin() + "\n";
        info += this.gerbong.infoNurudin();
        return info;
    }
}
