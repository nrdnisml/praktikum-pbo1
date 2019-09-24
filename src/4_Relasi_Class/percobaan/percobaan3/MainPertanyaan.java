package jobsheet04.percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai1841720060Nurudin masinis = new Pegawai1841720060Nurudin("1234", "Spongebob Squarepants");
        KeretaApi1841720060Nurudin keretaApi = new KeretaApi1841720060Nurudin("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.infoMasinisNurudin());
    }
}