package jobsheet07;

public class Staff1841720060Nurudin extends Karyawan1841720060Nurudin {
    private int mLembur;
    private double mGajiLembur;

    public int getmLembur() {
        return mLembur;
    }

    public void setmLembur(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getmGajiLembur() {
        return mGajiLembur;
    }

    public void setmGajiLembur(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }
    
    public double getmGaji(int lembur, double gajiLembur){
        return super.getmGaji()+lembur*gajiLembur;
    }
    
    public double getmGaji(){
       return super.getmGaji()+mLembur*mGajiLembur;
    }
    
    public void lihatInfoNurudin(){
        System.out.println("NIP\t\t: "+this.getmNip());
        System.out.println("Nama\t\t: "+this.getmNama());
        System.out.println("Golongan    : "+this.getmGolongan());
        System.out.println("Jml Lembur  : "+this.getmLembur());
        System.out.printf("Gaji Lembur  :%.0f\n",this.getmGajiLembur());
        System.out.printf("Gaji\t\t:%.0f\n ",this.getmGaji());
    }
}
