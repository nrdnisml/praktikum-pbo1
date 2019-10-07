package jobsheet06.percobaan5;

public class Karyawan1841720060Nurudin {
    public String nama,alamat,jk;
    public int umur,gaji;
    
    public Karyawan1841720060Nurudin(){
        
    }

    public Karyawan1841720060Nurudin(String nama, String alamt, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamt;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    
    public void tampilDataKaryawanNurudin(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Alamat\t\t: "+alamat);
        System.out.println("Jenis Kelamin\t: "+jk);
        System.out.println("Umur\t\t: " +umur);
        System.out.println("Gaji\t\t: "+gaji);
    }
}
