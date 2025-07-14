package org.puzre.creational.singleton;

public final class SingleThreadSingleton {

    private static SingleThreadSingleton instance;
    public String value;

    public String getValue() {
        return value;
    }

    private SingleThreadSingleton(String value) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        this.value = value;
    }

    public static SingleThreadSingleton getInstance(String value) {

        if (instance == null) {
            instance = new SingleThreadSingleton(value);
        }

        return instance;
    }

}
