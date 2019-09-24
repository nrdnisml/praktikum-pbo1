package jobsheet04.percobaan2;

public class MainPercobaan2Nurudin {
    public static void main(String[] args) {
       Mobil1841720060Nurudin m = new Mobil1841720060Nurudin();
       
       m.setMerkNurudin("Avanza");
       m.setBiayaNurudin(350000);
       
       Sopir1841720060Nurudin s = new Sopir1841720060Nurudin();
       s.setNamaNurudin("John Doe");
       s.setBiayaNurudin(200000);
       
       Pelanggan1841720060Nurudin p = new Pelanggan1841720060Nurudin();
       p.setNamaNurudin("Jane Doe");
       p.setMobilNurudin(m);
       p.setSopirNurudin(s);
       p.setHariNurudin(2);
       System.out.println("Biaya Total = "+p.hitungBiayaTotalNurudin());
       System.out.println(p.getMobilNurudin().getMerkNurudin()); 
    }
}
