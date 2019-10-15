package jobsheet07;

public class Manager1841720060Nurudin extends Karyawan1841720060Nurudin{
    private double mTunjangan;
    private String mBagian;
    private Staff1841720060Nurudin st[];

    public double getmTunjangan() {
        return mTunjangan;
    }

    public void setmTunjangan(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagian() {
        return mBagian;
    }

    public void setmBagian(String mBagian) {
        this.mBagian = mBagian;
    }

    public void setSt(Staff1841720060Nurudin[] st) {
        this.st = st;
    }
    
    public void viewStaffNurudin(){
        int i;
        System.out.println("-------------------------");
        for (i = 0; i < st.length; i++) {
            Staff1841720060Nurudin staff1841720060Nurudin = st[i];
        }
        System.out.println("-------------------------");
    }
    
    public void lihatInfoNurudin(){
        System.out.println("NIP         :"+this.getmNip());
        System.out.println("Nama        :"+this.getmNama());
        System.out.println("Golongan    :"+this.getmGolongan());
        System.out.println("Tunjangan   :"+this.getmTunjangan());
        System.out.println("Gaji        :"+this.getmGaji());
        System.out.println("Bagian      :"+this.getmBagian());
    }
    
    public double getmGaji(){
        return super.getmGaji()+mTunjangan;
    }
}
