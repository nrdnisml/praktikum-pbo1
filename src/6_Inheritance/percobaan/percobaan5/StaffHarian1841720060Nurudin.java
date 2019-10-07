package jobsheet06.percobaan5;

public class StaffHarian1841720060Nurudin extends Staff1841720060Nurudin{
    public int jmlJamKerja;

    public StaffHarian1841720060Nurudin() {
    }

    public StaffHarian1841720060Nurudin(int jlmJamKerja, String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jlmJamKerja;
    }
    
    public void tampilStaffHarian(){
        System.out.println("==========================Data Staff Harian==========================");
        super.TampilDataStaffNurudin();
        System.out.println("Jumlah jam kerja : "+jmlJamKerja);
        System.out.println("Gaji bersih\t: "+(gaji*jmlJamKerja+lembur-potongan));
    }
}
