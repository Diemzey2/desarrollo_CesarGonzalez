package com.mayab.desarrollo.creacion.singleton;

public class Main {

    public static void main(String[] args){

        System.out.println("----PATRON SINGLETON----");
        System.out.println("-----CESAR GONZALEZ-----");
        System.out.println("--------00404288--------\n");

        Horario horario = Horario.obtenerInstancia();

        horario.añadir();
        horario.eliminar();
        horario.consultar();



    }

}
