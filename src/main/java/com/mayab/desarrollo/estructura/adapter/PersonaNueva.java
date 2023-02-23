package com.mayab.desarrollo.estructura.adapter;

public class PersonaNueva {
    private String nombre;
    private int edad;

    public PersonaNueva(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

