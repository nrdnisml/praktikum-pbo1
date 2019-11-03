package jobsheet10.percobaan;

public class ElectricityBill1841720060Nurudin implements Payable1841720060Nurudin {

    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720060Nurudin(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getmKwh() {
        return mKwh;
    }

    public void setmKwh(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public int getPaymentAmountNurudin() {
        return mKwh * getBasePriceNurudin();
    }

    public int getBasePriceNurudin() {
        int bPrice = 0;
        switch (mCategory) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }
    
    public String getBillInfoNurudin(){
        return "kWh = "+mKwh+"\n"+"Category = "+mCategory+"("+getBasePriceNurudin()+" per kWh)\n";
    }
}
