package tgs_js_6;

public class Komputer1841720060Nurudin {

    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer1841720060Nurudin() {
    }

    public Komputer1841720060Nurudin(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilDataNurudin() {
        System.out.println("Merk\t\t : " + merk);
        System.out.println("Jenis Prosesor\t : " + jnsProsesor);
        System.out.println("Kecepatan Memory : " + kecProsesor + " GHz");
        System.out.println("Size Memory\t : " + sizeMemory + " GB");
    }
}
