package com.mayab.desarrollo.comportamiento.observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------OBSERVER--------");
        System.out.println("-----CESAR GONZALEZ-----");
        System.out.println("--------00404288--------\n");
        Vuelo vuelo = new Vuelo("Mérida (MID) - CDMX (NLU) ", "09:00", "a tiempo", "19/02/2023", "B4");

        Pasajero pasajero1 = new Pasajero("📱Patricia");
        Pasajero pasajero2 = new Pasajero("📱César");
        PantallasAeropuerto display = new PantallasAeropuerto();
        Tripulantes crew = new Tripulantes();

        vuelo.registerObserver(pasajero1);
        vuelo.registerObserver(pasajero2);
        vuelo.registerObserver(display);
        vuelo.registerObserver(crew);


        System.out.println("");
        System.out.println("SE RETRASA EL VUELO");

        vuelo.setStatus("retrasado");

        System.out.println("");
        System.out.println("CAMBIA DE PUERTA");

        vuelo.setPuerta("B6");

        vuelo.removeObserver(pasajero1);

        System.out.println("");
        System.out.println("SE CANCELA EL VUELO");

        vuelo.setStatus("cancelado");
        vuelo.setPuerta("N/A");
    }
}