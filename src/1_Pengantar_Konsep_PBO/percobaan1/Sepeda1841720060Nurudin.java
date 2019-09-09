package sepedademo;

public class Sepeda1841720060Nurudin {
    private String mMerek;
    private int mKecepatan,mGear;
    
    public void setMerekNurudin(String newValue){
        mMerek = newValue;
    }
    
    public void gantiGearNurudin(int newValue){
        mGear = newValue;
    }
    
    public void tambahKecepatanNurudin(int increment){
        mKecepatan += increment;
    }
    
    public void remNurudin(int decrement){
        mKecepatan -= decrement;
    }
    
    public void cetakStatusNurudin(){
        System.out.println("Merek : "+mMerek);
        System.out.println("Kecepatan : "+mKecepatan);
        System.out.println("Gear : "+ mGear);
    }
}
