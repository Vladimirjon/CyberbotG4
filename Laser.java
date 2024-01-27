public class Laser implements IArma{
    private boolean laser;

    public boolean isLaserequipped() {
        return laser;
    }

    @Override
    public void Disaparar() {
        System.out.println("Disparo con el laser");
    }
    
    public Laser(boolean laser){
        this.laser=laser;
    }

}
