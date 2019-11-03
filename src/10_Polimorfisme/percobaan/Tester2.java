package jobsheet10.percobaan;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee1841720060Nurudin pEmp = new PermanentEmployee1841720060Nurudin("Dedik", 500);
        Employee1841720060Nurudin e;
        
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoNurudin());
        System.out.println("-------------------------");
        System.out.println(""+pEmp.getEmployeeInfoNurudin());
    }
}
