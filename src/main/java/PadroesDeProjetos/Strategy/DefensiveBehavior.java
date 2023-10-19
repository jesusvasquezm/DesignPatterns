package PadroesDeProjetos.Strategy;

public class DefensiveBehavior implements Behavior{

    @Override
    public void move() {
        System.out.println("It is moving defensively");
    }
}
