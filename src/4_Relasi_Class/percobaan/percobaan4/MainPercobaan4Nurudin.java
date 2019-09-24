package jobsheet04.percobaan4;

public class MainPercobaan4Nurudin {
    public static void main(String[] args) {
        Penumpang1841720060Nurudin p = new Penumpang1841720060Nurudin("12345", "Mr.Krab");
        Penumpang1841720060Nurudin budi = new Penumpang1841720060Nurudin("67890", "Budi");
        Gerbong1841720060Nurudin gerbong = new Gerbong1841720060Nurudin("A", 10);
        gerbong.setPenumpangNurudin(p, 1);
        gerbong.setPenumpangNurudin(budi, 1);
        System.out.println(gerbong.infoNurudin());
    }
}
