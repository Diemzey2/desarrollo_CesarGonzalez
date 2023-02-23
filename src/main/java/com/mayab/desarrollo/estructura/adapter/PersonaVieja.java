package com.mayab.desarrollo.estructura.adapter;
import java.time.LocalDate;

public class PersonaVieja {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public PersonaVieja(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
