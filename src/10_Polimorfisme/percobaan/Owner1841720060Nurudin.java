package jobsheet10.percobaan;

public class Owner1841720060Nurudin {
    public void payNurudin(Payable1841720060Nurudin p){
        System.out.println("Total payment = "+p.getPaymentAmountNurudin());
        if (p instanceof ElectricityBill1841720060Nurudin) {
            ElectricityBill1841720060Nurudin eb = (ElectricityBill1841720060Nurudin) p;
            System.out.println(""+eb.getBillInfoNurudin());
        }else if (p instanceof PermanentEmployee1841720060Nurudin) {
            PermanentEmployee1841720060Nurudin pe = (PermanentEmployee1841720060Nurudin) p;
            pe.getEmployeeInfoNurudin();
            System.out.println(""+pe.getEmployeeInfoNurudin());
        }
    }
    public void showMyEmployeeNurudin(Employee1841720060Nurudin e){
        System.out.println(""+e.getEmployeeInfoNurudin());
        if (e instanceof PermanentEmployee1841720060Nurudin) {
            System.out.println("You have to pay her/him monthly");
        }else{
            System.out.println("No need to pay him/her :)");
        }
    }
}
