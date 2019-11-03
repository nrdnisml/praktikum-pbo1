package jobsheet10.percobaan;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee1841720060Nurudin pEmp = new PermanentEmployee1841720060Nurudin("Dedik", 500);
        InternshipEmployee1841720060Nurudin iEmp = new InternshipEmployee1841720060Nurudin("Sunarto", 5);
        ElectricityBill1841720060Nurudin eBill = new ElectricityBill1841720060Nurudin(5, "A-1");
        Employee1841720060Nurudin e[] = {pEmp, iEmp};
        Payable1841720060Nurudin p[] = { pEmp,eBill};
       // Employee1841720060Nurudin e2[] = {pEmp,iEmp,eBill};
    }
}
