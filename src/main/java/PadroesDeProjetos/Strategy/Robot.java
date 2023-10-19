package PadroesDeProjetos.Strategy;

public class Robot {

    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void mover(){
        behavior.move();
    }
}
