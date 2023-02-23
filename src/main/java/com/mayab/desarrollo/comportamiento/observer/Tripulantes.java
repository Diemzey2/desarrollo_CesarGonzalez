package com.mayab.desarrollo.comportamiento.observer;

class Tripulantes implements Observer {
    public void update(String fromTo, String hora, String status, String dia, String puerta) {
        System.out.println("✈️ Tripulantes:  " + fromTo + " Estado: " + status+ " " + "Puerta: " + puerta + "");
    }
}
