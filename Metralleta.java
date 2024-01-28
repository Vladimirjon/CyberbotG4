public class Metralleta implements IArma{
    private boolean pjmetralleta;

    public boolean ispjMetralletaeqquiped() {
        return pjmetralleta;
    }

    @Override
    public void pjDisaparar() {
        System.out.println("Disparo con la metralleta multiple de salida ");
        System.out.println("Metralleta (MK61 Vulcan) ");
    }

    public Metralleta(boolean pjmetralleta){
        this.pjmetralleta=pjmetralleta;
    }

}
