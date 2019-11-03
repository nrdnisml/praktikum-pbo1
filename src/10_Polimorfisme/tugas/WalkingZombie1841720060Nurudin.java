package tgs_js_10;

public class WalkingZombie1841720060Nurudin extends Zombie1841720060Nurudin {

    public WalkingZombie1841720060Nurudin(int mHealth, int mLevel) {
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }

    @Override
    public void healNurudin() {
        if (this.mLevel == 1) {
            mHealth += (mHealth * 20 / 100);
        } else if (this.mLevel == 2) {
            mHealth += (mHealth * 30 / 100);
        }else {
            mHealth += (mHealth * 40/100);
        }
    }

    @Override
    public void destroyedNurudin() {
        mHealth -= mHealth * 20/100;
    }

    @Override
    public String getZombieInfo() {
        String info = "Walking Zombie Data = \nHealth = " + mHealth + "\nLevel = " + mLevel;
        return info;
    }
}
