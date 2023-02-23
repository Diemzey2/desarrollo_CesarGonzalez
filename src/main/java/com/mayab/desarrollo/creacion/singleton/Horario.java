package com.mayab.desarrollo.creacion.singleton;

public class Horario {

    private static Horario instancia = null;
    private Horario() {}

    public static Horario obtenerInstancia(){
        if (instancia ==null){
            instancia = new Horario();
        }
        return instancia;
    }

    public void añadir(){
        System.out.println("Se ha añadido la clase con exito");
    };

    public void eliminar(){
        System.out.println("Se ha eliminado la clase con exito");
    };

    public void consultar(){
        System.out.println("Se ha consultado la clase con exito");
    };



}
