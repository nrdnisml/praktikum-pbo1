package jobsheet06.percobaan3;

public class Tabung1841720060Nurudin extends  Bangun1841720060Nurudin{
    protected int t;
    public void setSuperPhiNurudin(double phi){
        super.phi = phi;
    }
    
    public void setSuperRNurudin(int r){
        super.r = r;
    }
    public void setTNurudin(int t){
        this.t = t;
    }
    
    public void volumeNurudin(){
        System.out.println("Volume Tabung adalah \t:"+super.phi*super.r*super.r*this.t);
    }
}
