package PadroesDeProjetos.Strategy;

public class NormalBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("It is moving normally....");
    }
}
