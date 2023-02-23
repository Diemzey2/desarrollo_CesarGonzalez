package com.mayab.desarrollo.estructura.adapter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        System.out.println("----PATRON ADAPTER----");
        System.out.println("-----CESAR GONZALEZ-----");
        System.out.println("--------00404288--------\n");

        PersonaNueva personaNueva = new PersonaNueva("Juan Pérez", 25);

        // Crear persona vieja
        PersonaVieja personaVieja = new PersonaVieja("Cesar", "Gonzalez", LocalDate.of(2002, 04, 05));

        // Adaptar persona vieja a persona nueva
        personaNueva = adaptarPersona(personaVieja);

        // Crear lista de personas nuevas
        ArrayList<PersonaNueva> personasNuevas = new ArrayList<PersonaNueva>();

        // Agregar personas a la lista
        personasNuevas.add(personaNueva);
        personasNuevas.add(new PersonaNueva("Alejandro Ruanova", 24));
        personasNuevas.add(new PersonaNueva("Dimitri Novelo", 19));

        for (PersonaNueva persona : personasNuevas) {
            System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años.");
        }
    }

    public static PersonaNueva adaptarPersona(PersonaVieja personaVieja) {
        String nombre= personaVieja.getNombre() + " " + personaVieja.getApellido();
        int edad = calculoEdad(personaVieja.getFechaNacimiento());
        return new PersonaNueva(nombre, edad);
    }

    public static int calculoEdad(LocalDate fechaNacimiento){
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if(fechaActual.getMonthValue() < fechaNacimiento.getMonthValue()){
            edad--;
        }else if(fechaActual.getMonthValue() == fechaNacimiento.getMonthValue() && fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth()){
            edad--;
        }
        return edad;
    }
}
