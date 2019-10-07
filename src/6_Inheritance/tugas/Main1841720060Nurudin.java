package tgs_js_6;

public class Main1841720060Nurudin {

    public static void main(String[] args) {
        System.out.println("Mac: ");
        Mac1841720060Nurudin mac1 = new Mac1841720060Nurudin("MacBook Pro", 3, 1000, "Intel Core i5", "MacBook", "Eset NOD32");
        mac1.tampilMacNurudin();
        System.out.println("\nWindows: ");
        Windows1841720060Nurudin wd1 = new Windows1841720060Nurudin("HP Pavilion 14", 5, 2000, "AMD Ryzen 5", "Lithium-Ion (Li-Ion)", "Bluetooth");
        wd1.tampilWindowsNurudin();
        System.out.println("\nPC: ");
        PC1841720060Nurudin pc1 = new PC1841720060Nurudin("Lenovo", 5, 1000, "Intel Core i10", 15);
        pc1.tampilPCNurudin();
    }
}
