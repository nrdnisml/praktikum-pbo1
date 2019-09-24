package tgs_js_4;

public class Gerbong1841720060Nurudin {
    
    private String mKode;
    private Kursi1841720060Nurudin[] arrayKursi;

    public Gerbong1841720060Nurudin(String mKode, int jumlah) {
        this.mKode = mKode;
        this.arrayKursi = new Kursi1841720060Nurudin[jumlah];
        this.initKursiNurudin();
    }
    public String getmKodeNurudin() {
        return mKode;
    }
    public void setmKodeNurudin(String mKode) {
        this.mKode = mKode;
    }
    public Kursi1841720060Nurudin[] getArrayKursiNurudin() {
        return arrayKursi;
    }
    public void setPenumpangNurudin(Penumpang1841720060Nurudin penumpang, int nomer) {
        if (this.arrayKursi[nomer-1].getPenumpangNurudin() == null) {
            this.arrayKursi[nomer-1].setPenumpangNurudin(penumpang);
        }else{
            System.out.println("sorry kursi "+nomer+" tidak kosong. Silahkan pilih kursi lain\n");
        }
    }
    private void initKursiNurudin(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi1841720060Nurudin(String.valueOf(i+1));
        }
    }
    public String infoNurudin(){
        String info = "";
        info += "======== \tGerbong "+mKode+"\t ========\n";
        for (Kursi1841720060Nurudin kursi : arrayKursi) {
            info += kursi.infoNurudin();
        }
        return info;
    }
}