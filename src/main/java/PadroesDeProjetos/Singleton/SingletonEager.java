package PadroesDeProjetos.Singleton;

public class SingletonEager {

    /*
    Singleton eager "apressado" = instancia no começo para depois chamar a metodo
    */

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
