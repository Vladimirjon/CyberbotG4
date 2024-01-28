public class Laser implements IArma{
    private boolean pjlaser;

    public boolean ispjLaserequipped() {
        return pjlaser;
    }

    public void setPjlaser(boolean pjlaser) {
        this.pjlaser = pjlaser;
    }

    public boolean ispjLaserequipped() {
        return pjlaser;
    }

    @Override
    public void pjDisaparar() {
        System.out.println("Disparo con el pjlaser");
    }
    
    public Laser(Exobot oExobot){
         this.pjlaser=oExobot.getPjequiparlaser();
    }

}
