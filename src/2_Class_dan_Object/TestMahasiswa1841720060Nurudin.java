package jobsheet02;

public class TestMahasiswa1841720060Nurudin {
    public static void main(String[] args) {
        Mahasiswa1841720060Nurudin mhs1 = new Mahasiswa1841720060Nurudin();
        Mahasiswa1841720060Nurudin mhs2 = new Mahasiswa1841720060Nurudin();
        Mahasiswa1841720060Nurudin mhs3 = new Mahasiswa1841720060Nurudin();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodataNurudin();
        System.out.println("");
        mhs2.nim = 102;
        mhs2.nama = "Londo";
        mhs2.alamat = "Jl. Vinolia No 1B";
        mhs2.kelas = "1A";
        mhs2.tampilBiodataNurudin();
        System.out.println("");
        mhs3.nim = 103;
        mhs3.nama = "Scooby Doo";
        mhs3.alamat = "Jl. Vinolia No 3A";
        mhs3.kelas = "1A";
        mhs3.tampilBiodataNurudin();
    }
}
