package jobsheet06.percobaan5;

public class StaffTetap1841720060Nurudin extends Staff1841720060Nurudin{
    public String golongan;
    public int asuransi;

    public StaffTetap1841720060Nurudin(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan,String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    public void tampilStaffTetapNurudin(){
        System.out.println("=====================Data Staff Tetap=====================");
        super.TampilDataStaffNurudin();
        System.out.println("Golongan \t: "+golongan);
        System.out.println("Jumlah Asuransi\t: "+asuransi);
        System.out.println("Gaji Bersih\t: "+(gaji+lembur-potongan-asuransi));
    }
}
