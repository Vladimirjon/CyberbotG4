public class Bazuca implements IArma{
    private boolean bazuca;
    
    public boolean isBazucaequipped() {
        return bazuca;
    }

    @Override
    public void Disaparar() {
        System.out.println("Estoy disparando con mi bazuca");
    }

    public Bazuca(boolean bazuca){
        this.bazuca = bazuca;
    }
}
