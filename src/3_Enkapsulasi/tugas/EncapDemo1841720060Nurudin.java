package tgs_js_3;

public class EncapDemo1841720060Nurudin {
    private String mName;
    private int mAge;
    
    public String getNameNurudin(){
        return mName;
    }
    public void setNameNurudin(String newName){
        mName = newName;
    }
    public int getAgeNurudin(){
        return mAge;
    }
    public void setAgeNurudin(int newAge){
        if (newAge>30) {
            mAge = 30;
        }else if (mAge<18) {
            mAge = 18;
        }else{
         mAge = newAge;   
        }
    }
}
