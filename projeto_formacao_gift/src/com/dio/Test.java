package com.dio;

import com.dio.Facade.Facade;
import com.dio.Singleton.SingletonEager;
import com.dio.Singleton.SingletonLazy;
import com.dio.Singleton.SingletonLazyHolder;
import com.dio.Strategy.*;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {



        //SINGLETON!
        SingletonLazy lazy= SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy=SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager=SingletonEager.getInstancia();
        System.out.println(eager);



        SingletonLazyHolder lazyHolder=SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder=SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);



        //STRATEGY

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivamente();
        Comportamento agressivo = new ComportamentoAgressivamente();




        Robo robo = new Robo();
        robo.setComportamento(normal);



        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();







        //FACADE!!!!


        Facade facade =new Facade();
        facade.migrarCliente("Venilton","1480202");



    }
}
