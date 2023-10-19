package PadroesDeProjetos.Singleton;

public class SingletonLazy {
    /*
    Singleton lazy = verifica se é nulo para depois instaciar no metodo
    */



    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
