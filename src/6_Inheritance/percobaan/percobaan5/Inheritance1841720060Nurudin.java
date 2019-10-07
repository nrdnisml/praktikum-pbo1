package jobsheet06.percobaan5;

public class Inheritance1841720060Nurudin {
    public static void main(String[] args) {
        Manager1841720060Nurudin m = new Manager1841720060Nurudin();
        m.nama="vivin";
        m.alamat="Jl.Vinolia";
        m.umur=25;
        m.jk="perempuan";
        m.gaji=3000000;
        m.tunjangan=10000000;
        m.TampilDataManagerNurudin();
        
        Staff1841720060Nurudin s= new Staff1841720060Nurudin();
        s.nama="Lestari";
        s.alamat="Malang";
        s.umur=25;
        s.jk="perempuan";
        s.gaji=2000000;
        s.lembur=5000000;
        s.potongan=250000;
        s.TampilDataStaffNurudin();
    }
}
