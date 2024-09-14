package org.example;

import org.example.facade.Facade;
import org.example.singleton.SingletonEager;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;
import org.example.strategy.*;

public class Test {


    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.migrarCliente("Gabriel","5556666");


        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defenciso = new ComportamentoDefenciso();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();

        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(defenciso);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();




        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);


    }
}
