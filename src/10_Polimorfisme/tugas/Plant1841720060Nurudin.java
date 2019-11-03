package tgs_js_10;

public class Plant1841720060Nurudin {

    public void doDestroy(IDestroyable1841720060Nurudin d) {
        if (d instanceof WalkingZombie1841720060Nurudin) {
            d.destroyedNurudin();
        }else if (d instanceof JumpingZombie1841720060Nurudin) {
            d.destroyedNurudin();
        }else if (d instanceof Barrier1841720060Nurudin) {
            d.destroyedNurudin();
        }
    }
}
