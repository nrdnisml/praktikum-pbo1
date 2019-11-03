package tgs_js_10;

public class Barrier1841720060Nurudin implements IDestroyable1841720060Nurudin{
    
    private int mStrength;

    public Barrier1841720060Nurudin(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        this.mStrength = mStrength;
    }

    @Override
    public void destroyedNurudin() {
        this.mStrength -= 9;
    }
    
    public String getBarrierInfoNurudin(){
        String info = "Barrier Strength = "+getmStrength();
        return info;
    }
}
