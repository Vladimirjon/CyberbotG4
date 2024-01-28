public class ProfesorIngles implements IIngles {
    private String exobot;

    public ProfesorIngles(String exobot) {
        this.exobot = exobot;
    
    }

    @Override
    public String pjenseniarIngles() {
        return "Se ha enseñado ingles a"+this.exobot+".";
    }
}
