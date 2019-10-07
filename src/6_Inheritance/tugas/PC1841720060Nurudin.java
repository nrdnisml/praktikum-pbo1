package tgs_js_6;

public class PC1841720060Nurudin extends Komputer1841720060Nurudin {

    public int ukuranMonitor;

    public PC1841720060Nurudin() {
    }

    public PC1841720060Nurudin(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPCNurudin() {
        super.tampilDataNurudin();
        System.out.println("Ukuran Monitor\t : " + ukuranMonitor + " Inch");
    }
}
