public class Lanzafuegos implements IArma{
    private boolean pjlanzafuego;

    public boolean ispjLanzafuegoequipped() {
        return pjlanzafuego;
    }

    @Override
    public void pjDisaparar() {
        System.out.println("Utilizando lanzafuegos");
    }

    public Lanzafuegos(boolean pjlanzafuego){
        this.pjlanzafuego = pjlanzafuego;
    }

}
