package PadroesDeProjetos;

import PadroesDeProjetos.Facade.Facade;
import PadroesDeProjetos.Singleton.SingletonEager;
import PadroesDeProjetos.Singleton.SingletonLazy;
import PadroesDeProjetos.Singleton.SingletonLazyHolder;
import PadroesDeProjetos.Strategy.*;

public class Test {

    public static void main(String[] args) {
        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("============================");

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);
        System.out.println("============================");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        System.out.println("============================");
        //Strategy
        Behavior normalBehavior = new NormalBehavior();
        Behavior defensiveBehavior = new DefensiveBehavior();
        Behavior agressiveBehavior = new AgressiveBehavior();

        Robot robot = new Robot();

        robot.setBehavior(normalBehavior);
        robot.mover();
        robot.mover();

        robot.setBehavior(defensiveBehavior);
        robot.mover();

        robot.setBehavior(agressiveBehavior);
        robot.mover();
        robot.mover();
        robot.mover();


        System.out.println("=======================================");

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Jesus", "01333011");
    }

}
