package jobsheet07;

public class Utama1841720060Nurudin {
    public static void main(String[] args) {
        System.out.println("Program tentang Class Manager & Staff");
        Manager1841720060Nurudin man[]= new Manager1841720060Nurudin[2];
        Staff1841720060Nurudin staff1[]= new Staff1841720060Nurudin[2];
        Staff1841720060Nurudin staff2[]= new Staff1841720060Nurudin[3];
        
        man[0] = new Manager1841720060Nurudin();
        man[0].setmNama("Tedjo");
        man[0].setmNip("101");
        man[0].setmGolongan("1");
        man[0].setmTunjangan(5000000);
        man[0].setmBagian("Administrasi");
        
        man[1] = new Manager1841720060Nurudin();
        man[1].setmNama("Atika");
        man[1].setmNip("102");
        man[1].setmGolongan("1");
        man[1].setmTunjangan(2500000);
        man[1].setmBagian("Pemasaran");
        
        staff1[0] = new Staff1841720060Nurudin();
        staff1[0].setmNama("Usman");
        staff1[0].setmNip("0003");
        staff1[0].setmGolongan("2");
        staff1[0].setmLembur(10);
        staff1[0].setmGajiLembur(10000);
        
        staff1[1] = new Staff1841720060Nurudin();
        staff1[1].setmNama("Anugrah");
        staff1[1].setmNip("0005");
        staff1[1].setmGolongan("2");
        staff1[1].setmLembur(10);
        staff1[1].setmGajiLembur(55000);
        man[0].setSt(staff1);
        
        staff2[0] = new Staff1841720060Nurudin();
        staff2[0].setmNama("Hendra");
        staff2[0].setmNip("0004");
        staff2[0].setmGolongan("3");
        staff2[0].setmLembur(15);
        staff2[0].setmGajiLembur(5500);
        
        staff2[1] = new Staff1841720060Nurudin();
        staff2[1].setmNama("Arie");
        staff2[1].setmNip("0006");
        staff2[1].setmGolongan("4");
        staff2[1].setmLembur(5);
        staff2[1].setmGajiLembur(100000);
        
        staff2[2] = new Staff1841720060Nurudin();
        staff2[2].setmNama("Mentari");
        staff2[2].setmNip("0007");
        staff2[2].setmGolongan("3");
        staff2[2].setmLembur(6);
        staff2[2].setmGajiLembur(20000);
        
        man[1].setSt(staff2);
        
        man[0].lihatInfoNurudin();
        man[1].lihatInfoNurudin();
    }
}
