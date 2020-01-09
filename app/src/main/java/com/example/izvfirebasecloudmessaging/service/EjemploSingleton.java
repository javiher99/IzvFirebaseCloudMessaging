package com.example.izvfirebasecloudmessaging.service;

public class EjemploSingleton {

    private int valor;
    private static EjemploSingleton instance = null;

    public EjemploSingleton() {
        valor = 1;
    }

    public static EjemploSingleton getInstance(){
        if(instance == null){
            instance = new EjemploSingleton();
        }
        return instance;
    }

    public int getValor(){
        return valor;
    }

    public void seVtalor(int valor){
        this.valor = valor;
    }
}
