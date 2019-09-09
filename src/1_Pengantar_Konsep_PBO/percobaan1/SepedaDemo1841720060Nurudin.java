/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

public class SepedaDemo1841720060Nurudin {

    public static void main(String[] args) {
        // TODO code application logic here
        Sepeda1841720060Nurudin spd1 = new Sepeda1841720060Nurudin();
        Sepeda1841720060Nurudin spd2 = new Sepeda1841720060Nurudin();
        SepedaGunung1841720060Nurudin spd3 = new SepedaGunung1841720060Nurudin();
        
        spd1.setMerekNurudin("Polygone");
        spd1.tambahKecepatanNurudin(10);
        spd1.gantiGearNurudin(2);
        spd1.cetakStatusNurudin();
        
        spd2.setMerekNurudin("wim cycle");
        spd2.tambahKecepatanNurudin(10);
        spd2.gantiGearNurudin(2);
        spd2.tambahKecepatanNurudin(10);
        spd2.gantiGearNurudin(3);
        spd2.cetakStatusNurudin();
    }
}