package com.mayab.desarrollo.creacion.simpleFactory;

public class FabricaTriangulo {
    public Triangulo crearTriangulo(int LadoA, int LadoB, int LadoC) {
        if (LadoA == LadoB && LadoB == LadoC) {
            return new TrianguloEquilatero(LadoA);
        } else if (LadoA == LadoB || LadoB == LadoC || LadoA == LadoC) {
            return new TrianguloIsoceles(LadoA, LadoB);
        } else {
            return new TrianguloEscaleno(LadoA, LadoB, LadoC);
        }
    }
}
