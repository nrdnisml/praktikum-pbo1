package jobsheet06.percobaan5;

public class Staff1841720060Nurudin extends Karyawan1841720060Nurudin{
    public int lembur,potongan;
    
    public Staff1841720060Nurudin(){
        
    }

    public Staff1841720060Nurudin(String nama, String alamat, String jk, int umur, int gaji,int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    public void TampilDataStaffNurudin(){
        System.out.println("Lembur\t\t: "+ lembur);
        System.out.println("Potongan\t: "+potongan);
        System.out.println("Total Gaji\t: "+(gaji+lembur-potongan));
    }
}