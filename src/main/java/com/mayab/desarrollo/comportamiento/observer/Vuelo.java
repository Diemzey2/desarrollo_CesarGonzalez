package com.mayab.desarrollo.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

// Sujeto observable (subject)
class Vuelo {
    private String fromTo;
    private String hora;
    private String status;
    private String dia;
    private String puerta;
    private List<Observer> observers = new ArrayList<>();

    public Vuelo(String fromTo, String hora, String status, String dia, String puerta) {
        this.fromTo = fromTo;
        this.hora = hora;
        this.status = status;
        this.dia = dia;
        this.puerta = puerta;
    }

    public String getFromTo() {
        return fromTo;
    }

    public void setFromTo(String fromTo) {
        this.fromTo = fromTo;
        notifyObservers();
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
        notifyObservers();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
        notifyObservers();
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
        notifyObservers();
    }

    // Métodos del patrón Observer
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(fromTo, hora, status, dia, puerta);
        }
    }
}

class Pasajero implements Observer {
    private String nombre;

    public Pasajero(String nombre) {
        this.nombre = nombre;
    }

    public void update(String fromTo, String hora, String status, String dia, String puerta) {
        System.out.println(nombre + ": El vuelo de " + fromTo + " se actualizó a " + status + " y su puerta es " + puerta);
    }
}





