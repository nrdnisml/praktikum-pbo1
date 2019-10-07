package tgs_js_6;

public class Mac1841720060Nurudin extends Laptop1841720060Nurudin {

    public String security;

    public Mac1841720060Nurudin() {
    }

    public Mac1841720060Nurudin(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String sekuriti) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = sekuriti;
    }

    public void tampilMacNurudin() {
        super.tampilLaptopNurudin();
        System.out.println("Sekuriti\t : " + security);
    }
}
