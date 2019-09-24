package jobsheet04.percobaan1;

public class MainPercobaan1Nurudin {
    
    public static void main(String[] args) {
        Processor1841720060Nurudin p = new Processor1841720060Nurudin("Intel i5", 3);
        Laptop1841720060Nurudin l = new Laptop1841720060Nurudin("Thinkpad", p);
        l.infoNurudin();
        
        Processor1841720060Nurudin p1 = new Processor1841720060Nurudin();
        p1.setMerkNurudin("Intel i5");
        p1.setCacheNurudin(4);
        Laptop1841720060Nurudin L1 = new Laptop1841720060Nurudin();
        L1.setMerkNurudin("Thinkpad");
        L1.setProcNurudin(p1);
        L1.infoNurudin();
    }
}