public class Laser implements IArma{
    private boolean equipado;

    public boolean isequipado() {
        return equipado;
    }

    @Override
    public void Disaparar() {
        System.out.println("Disparo con el laser");
    }
    public Laser(boolean equipado){
        this.equipado=equipado;
    }

}
