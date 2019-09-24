package jobsheet04.percobaan1;

public class Processor1841720060Nurudin {
    private String mMerk;
    private double mCache;

    public Processor1841720060Nurudin() {
    }
    public Processor1841720060Nurudin(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }
    public void setMerkNurudin(String merk){
        mMerk = merk;
    }
    public String getMerkNurudin(){
        return mMerk; 
    }
    public void setCacheNurudin(double cache){
        mCache = cache;
    }
    public double getCacheNurudin(){
        return mCache;
    }
    public void infoNurudin(){
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory   = %s\n", mCache);
    }
}