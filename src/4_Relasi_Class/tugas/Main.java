package tgs_js_4;
import java.util.Scanner;
public class Main {

    static int pil, inputan;

    static void menu() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tMenu");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Input Penumpang");
        System.out.println("2. info Masinis");
        System.out.println("3. Info Kursi Gerbong");
        System.out.println("4. Info Kereta");
        System.out.println("5. Keluar");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Pilihan : ");
    }

    public static void main(String[] args) {
        
        String nama,ktp;
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        Gerbong1841720060Nurudin gerbong = new Gerbong1841720060Nurudin("A", 10);
        Pegawai1841720060Nurudin masinis = new Pegawai1841720060Nurudin("112", "Nizar");
        Pegawai1841720060Nurudin asisten = new Pegawai1841720060Nurudin("122", "Mansyur");
        KeretaApi1841720060Nurudin kereta = new KeretaApi1841720060Nurudin("Sanjaya", "Ekonomi", masinis, asisten, gerbong);
        
        do{
            menu();
            inputan = in.nextInt();
            switch(inputan){
                case 1 :
                    System.out.print("Nama :");
                    nama = sc.next();
                    System.out.print("KTP  :");
                    ktp = sc.next();
                    System.out.print("Pilih Kursi :");
                    pil = sc.nextInt();
                    Penumpang1841720060Nurudin x=new Penumpang1841720060Nurudin(ktp, nama);
                    gerbong.setPenumpangNurudin(x, pil);
                    break;
                case 2 :
                    System.out.println(masinis.infoNurudin());
                    break;
                case 3 :
                    System.out.println(gerbong.infoNurudin());
                    
                    break;
                case 4 :
                    System.out.println(kereta.infoNurudin());
                    
                    break;    
            }
        }while(inputan!=5);
    }
}