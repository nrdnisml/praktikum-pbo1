package tgs_js_10;

public class Tester1841720060Nurudin {
    public static void main(String[] args) {
        WalkingZombie1841720060Nurudin wz = new WalkingZombie1841720060Nurudin(100, 1);
        JumpingZombie1841720060Nurudin jz = new JumpingZombie1841720060Nurudin(100, 2);
        Barrier1841720060Nurudin b = new Barrier1841720060Nurudin(100);
        Plant1841720060Nurudin p = new Plant1841720060Nurudin();
        
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfoNurudin());
        System.out.println("---------------------------");
        
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        
        
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfoNurudin());
    }
}
