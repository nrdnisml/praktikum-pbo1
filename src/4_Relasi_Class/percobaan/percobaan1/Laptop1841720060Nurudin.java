package jobsheet04.percobaan1;

public class Laptop1841720060Nurudin {

    private String mMerk;
    private Processor1841720060Nurudin proc;

    public Laptop1841720060Nurudin() {
    }
    public Laptop1841720060Nurudin(String mMerk, Processor1841720060Nurudin proc) {
        this.mMerk = mMerk;
        this.proc = proc;
    }
    public void setMerkNurudin(String merk){
        mMerk = merk;
    }
    public String getMerkNurudin(){
        return mMerk;
    }
    public void setProcNurudin(Processor1841720060Nurudin proc){
        this.proc = proc;
    }
    public Processor1841720060Nurudin getProcNurudin(){
        return proc;
    }
    public void infoNurudin() {
        System.out.println("Merk Laptop    = " + mMerk);
        proc.infoNurudin();
    }
}
