package jobsheet09.percobaan1;

public class Program1841720060Nurudin {
    public static void main(String[] args){
        Kucing1841720060Nurudin kucingKampung = new Kucing1841720060Nurudin();
        Ikan1841720060Nurudin lumbaLumba = new Ikan1841720060Nurudin();
        
        Orang1841720060Nurudin ani = new Orang1841720060Nurudin("Ani");
        Orang1841720060Nurudin budi = new Orang1841720060Nurudin("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
        
    }
}

