package tgs_js_4;

public class Kursi1841720060Nurudin {
    
    private String mNomer;
    private Penumpang1841720060Nurudin penumpang;

    public Kursi1841720060Nurudin(String mNomer) {
        this.mNomer = mNomer;
    }
    public String getmNomerNurudin() {
        return mNomer;
    }
    public void setmNomerNurudin(String mNomer) {
        this.mNomer = mNomer;
    }
    public Penumpang1841720060Nurudin getPenumpangNurudin() {
        return penumpang;
    }
    public void setPenumpangNurudin(Penumpang1841720060Nurudin penumpang) {
        this.penumpang = penumpang;
    }
    public String infoNurudin(){
        String info="";
        info += "======== Nomor Kursi "+mNomer+" ========\n";
        if (this.penumpang != null) {
            info += "Penumpang: "+penumpang.infoNurudin() + "\n";
        }
        return info;
    }
}