public class Bazuca implements IArma{
    public boolean isPjbazuca() {
        return pjbazuca;
    }

    public void setPjbazuca(boolean pjbazuca) {
        this.pjbazuca = pjbazuca;
    }

    private boolean pjbazuca;
    
    public boolean ispjBazucaequipped() {
        return pjbazuca;
    }

    @Override
    public void pjDisaparar() {
        System.out.println("Estoy disparando con mi bazuca");
    }

    public Bazuca(Exobot  oExobot){
         this.pjbazuca = oExobot.getPjequiparbazuca();
    }
}
