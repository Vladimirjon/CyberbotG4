public class ProfesorEspanol implements IEspanol {
    private String exobot;
    
    public ProfesorEspanol(String exobot) {
        this.exobot = exobot;
    }

    @Override
    public String pjensenaEspanol() {
        return "Se ha enseñado español a"+ this.exobot+".";
    }
}