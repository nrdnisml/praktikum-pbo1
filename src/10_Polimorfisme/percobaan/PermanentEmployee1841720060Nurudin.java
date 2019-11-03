package jobsheet10.percobaan;

public class PermanentEmployee1841720060Nurudin extends Employee1841720060Nurudin implements Payable1841720060Nurudin{
    private int mSalary;

    public PermanentEmployee1841720060Nurudin(String mName, int mSalary) {
        this.mName = mName;
        this.mSalary = mSalary;
    }

    public int getmSalary() {
        return mSalary;
    }

    public void setmSalary(int mSalary) {
        this.mSalary = mSalary;
    }

    public int getPaymentAmountNurudin(){
        return (int) (mSalary+0.05*mSalary);
    }    
    @Override
    public String getEmployeeInfoNurudin() {
        String info = super.getEmployeeInfoNurudin()+"\n";
        info+= "Registered as permanent employee with salary "+mSalary+"\n";
        return info;
    }
}
