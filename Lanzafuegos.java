public class Lanzafuegos implements IArma{
    private boolean pjlanzafuego;

    public boolean ispjLanzafuegoequipped() {
        return pjlanzafuego;
    }

    @Override
    public void pjDisaparar() {
        System.out.println("Utilizando lanzafuegos");
    }

    public Lanzafuegos(Exobot oExobot){
         this.pjlanzafuego = oExobot.getPjequiparlanzafuego();
     }

    public boolean isPjlanzafuego() {
        return pjlanzafuego;
    }

    public void setPjlanzafuego(boolean pjlanzafuego) {
        this.pjlanzafuego = pjlanzafuego;
    }

}
