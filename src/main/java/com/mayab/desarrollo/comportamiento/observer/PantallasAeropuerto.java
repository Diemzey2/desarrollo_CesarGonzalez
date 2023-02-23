package com.mayab.desarrollo.comportamiento.observer;

class PantallasAeropuerto implements Observer {
    public void update(String fromTo, String hora, String status, String dia, String puerta) {
        System.out.println("📺 Display: El vuelo de " + fromTo + " tiene estado " + status + " y su puerta es " + puerta);
    }
}