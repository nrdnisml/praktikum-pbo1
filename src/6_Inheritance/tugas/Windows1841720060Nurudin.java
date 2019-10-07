package tgs_js_6;

public class Windows1841720060Nurudin extends Laptop1841720060Nurudin {

    public String fitur;

    public Windows1841720060Nurudin() {
    }

    public Windows1841720060Nurudin(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindowsNurudin() {
        super.tampilLaptopNurudin();
        System.out.println("Fitur\t\t : " + fitur);
    }
}
