package jobsheet06.percobaan2;

public class ClassB1841720060Nurudin extends ClassA1841720060Nurudin{
    private int z;
    
    public void setZNurudin(int z){
        this.z = z;
    }
    
    public void getNilaiZNurudin(){
        System.out.println("nilai z\t: "+z);
    }
    public void getJumlahNurudin(){
        System.out.println("jumlah : "+(getXNurudin()+getYNurudin()+z));
    }
}
