package jobsheet10.percobaan;

public class Tester4 {

    public static void main(String[] args) {
        Owner1841720060Nurudin ow = new Owner1841720060Nurudin();
        ElectricityBill1841720060Nurudin eBill = new ElectricityBill1841720060Nurudin(5, "R-1");
        ow.payNurudin(eBill);
        System.out.println("-----------------------------");
        
        PermanentEmployee1841720060Nurudin pEmp = new PermanentEmployee1841720060Nurudin("Dedik", 500);
        ow.payNurudin(pEmp);
        System.out.println("-----------------------------");
        
        InternshipEmployee1841720060Nurudin iEmp = new InternshipEmployee1841720060Nurudin("Sunarto", 5);
        ow.showMyEmployeeNurudin(pEmp);
        System.out.println("-----------------------------");
        ow.showMyEmployeeNurudin(iEmp);
    }
}
