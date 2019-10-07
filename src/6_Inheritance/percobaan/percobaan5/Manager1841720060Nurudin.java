package jobsheet06.percobaan5;

public class Manager1841720060Nurudin extends Karyawan1841720060Nurudin{
    public int tunjangan;

    public Manager1841720060Nurudin() {
    }
    
    public void TampilDataManagerNurudin(){
        super.tampilDataKaryawanNurudin();
        System.out.println("Tunjangan\t: "+tunjangan);
        System.out.println("Total Gaji\t: "+(super.gaji+tunjangan));
    }
}
