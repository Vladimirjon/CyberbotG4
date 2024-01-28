public class Bazuca implements IArma{
    private boolean pjbazuca;
    
    public boolean ispjBazucaequipped() {
        return pjbazuca;
    }

    @Override
    public void pjDisaparar() {
        System.out.println("Estoy disparando con mi bazuca");
    }

    public Bazuca(boolean pjbazuca){
        this.pjbazuca = pjbazuca;
    }
}
