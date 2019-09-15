package jobsheet03.koperasigettersetter;

public class KoperasiDemo1841720060Nurudin {

    public static void main(String[] args) {
        Anggota1841720060Nurudin anggota1 = new Anggota1841720060Nurudin("Iwan","Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getNamaNurudin() + " : Rp. " + anggota1.getSimpananNurudin());

        anggota1.setNamaNurudin("Iwan Arjosari");
        anggota1.setAlamatNurudin("Jl. Sukarno Hatta no 10");

        anggota1.setorNurudin(100000);
        System.out.println("Simpanan " + anggota1.getNamaNurudin() + " : Rp. " + anggota1.getSimpananNurudin());

        anggota1.pinjamNurudin(5000);
        System.out.println("Simpanan " + anggota1.getNamaNurudin() + " : Rp. " + anggota1.getSimpananNurudin());
    }
}
