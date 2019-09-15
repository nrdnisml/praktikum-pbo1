package jobsheet03.motorenkapsulai;

public class Motor1841720060Nurudin {

    private int mKecepatan = 0;
    private boolean mKontakOn = false;

    public void nyalakanMesinNurudin() {
        mKontakOn = true;
    }

    public void matikanMesinNurudin() {
        mKontakOn = false;
        mKecepatan = 0;
    }

    public void tambahKecepatanNurudin() {
        if (mKontakOn == true) {
            mKecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off\n");
        }
    }

    public void kurangiKecepatanNurudin() {
        if (mKontakOn == true) {
            mKecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off\n");
        }
    }

    public void printStatus() {
        if (mKontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + mKecepatan + "\n");
    }
}