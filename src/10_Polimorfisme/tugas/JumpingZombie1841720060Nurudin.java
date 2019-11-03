package tgs_js_10;

public class JumpingZombie1841720060Nurudin extends Zombie1841720060Nurudin {

    public JumpingZombie1841720060Nurudin(int mHealth, int mLevel) {
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }

    @Override
    public void healNurudin() {
        if (this.mLevel == 1) {
            mHealth += (mHealth * 30 / 100);
        } else if (this.mLevel == 2) {
            mHealth += (mHealth * 40 / 100);
        } else if(this.mLevel == 3){
            mHealth += (mHealth * 50 / 100);
        }
    }

    @Override
    public void destroyedNurudin() {
       this.mHealth -= this.mHealth * 10 / 100;
    }

    @Override
    public String getZombieInfo() {
        String info = "Jumping Zombie Data = \nHealth = " + mHealth + "\nLevel = " + mLevel;
        return info;
    }
}
