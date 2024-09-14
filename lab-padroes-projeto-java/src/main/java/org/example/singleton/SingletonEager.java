package org.example.singleton;


/**
 * Singleton "apressado".
 *
 * @author GabrielDaCostaAlves
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}