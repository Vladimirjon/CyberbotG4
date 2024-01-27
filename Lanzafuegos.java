public class Lanzafuegos implements IArma{
    private boolean lanzafuego;

    public boolean isLanzafuegoequipped() {
        return lanzafuego;
    }

    @Override
    public void Disaparar() {
        System.out.println("Utilizando lanzafuegos");
    }

    public Lanzafuegos(boolean lanzafuego){
        this.lanzafuego = lanzafuego;
    }

}
