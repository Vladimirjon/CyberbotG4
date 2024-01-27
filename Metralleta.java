public class Metralleta implements IArma{
    private boolean metralleta;

    public boolean isMetralletaeqquiped() {
        return metralleta;
    }

    @Override
    public void Disaparar() {
        System.out.println("Disparo con la metralleta multiple de salida ");
        System.out.println("Metralleta (MK61 Vulcan) ");
    }

    public Metralleta(boolean metralleta){
        this.metralleta=metralleta;
    }

}
