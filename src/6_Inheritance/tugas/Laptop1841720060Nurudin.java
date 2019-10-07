package tgs_js_6;

public class Laptop1841720060Nurudin extends Komputer1841720060Nurudin {

    public String jnsBaterai;

    public Laptop1841720060Nurudin() {
    }

    public Laptop1841720060Nurudin(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLaptopNurudin() {
        super.tampilDataNurudin();
        System.out.println("Jenis Baterai\t : " + jnsBaterai);
    }
}
