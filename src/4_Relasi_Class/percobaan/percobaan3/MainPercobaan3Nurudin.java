package jobsheet04.percobaan3;

public class MainPercobaan3Nurudin {
    public static void main(String[] args) {
        Pegawai1841720060Nurudin masinis = new Pegawai1841720060Nurudin("1234","Spongebob");
        Pegawai1841720060Nurudin asisten = new Pegawai1841720060Nurudin("4567", "Patrick");
        KeretaApi1841720060Nurudin keretaApi = new KeretaApi1841720060Nurudin("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretaApi.infoNurudin());
    }
}
