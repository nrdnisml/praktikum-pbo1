package jobsheet10.percobaan;

public class InternshipEmployee1841720060Nurudin extends Employee1841720060Nurudin{
    private int mLength;

    public InternshipEmployee1841720060Nurudin(String mName,int mLength) {
        this.mName = mName;
        this.mLength = mLength;
    }

    public int getmLength() {
        return mLength;
    }

    public void setmLength(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfoNurudin() {
        String info = super.getEmployeeInfoNurudin()+"\n";
        info += "Registered as internship employee for "+mLength+" month/s\n";
        return info;
    }
}
