package com.mayab.desarrollo.creacion.builder;
public class SalaBuilder {

    private int sofa4;
    private int sofa3;
    private int sofa2;
    private int sofa1;
    private boolean mesaCentro;
    private boolean mesaLateral;
    private boolean lampara;

    public SalaBuilder() {
        // Valores por defecto
        this.sofa4 = 0;
        this.sofa3 = 0;
        this.sofa2 = 0;
        this.sofa1 = 0;
        this.mesaCentro = false;
        this.mesaLateral = false;
        this.lampara = false;
    }

    public SalaBuilder conSofa4(int cantidad) {
        this.sofa4 = cantidad;
        return this;
    }

    public SalaBuilder conSofa3(int cantidad) {
        this.sofa3 = cantidad;
        return this;
    }

    public SalaBuilder conSofa2(int cantidad) {
        this.sofa2 = cantidad;
        return this;
    }

    public SalaBuilder conSofa1(int cantidad) {
        this.sofa1 = cantidad;
        return this;
    }

    public SalaBuilder conMesaCentro() {
        this.mesaCentro = true;
        return this;
    }

    public SalaBuilder conMesaLateral() {
        this.mesaLateral = true;
        return this;
    }

    public SalaBuilder conLampara() {
        this.lampara = true;
        return this;
    }

    public Sala construir() {
        return new Sala(this);
    }

    public static class Sala {
        private final int sofa4;
        private final int sofa3;
        private final int sofa2;
        private final int sofa1;
        private final boolean mesaCentro;
        private final boolean mesaLateral;
        private final boolean lampara;

        private Sala(SalaBuilder builder) {
            this.sofa4 = builder.sofa4;
            this.sofa3 = builder.sofa3;
            this.sofa2 = builder.sofa2;
            this.sofa1 = builder.sofa1;
            this.mesaCentro = builder.mesaCentro;
            this.mesaLateral = builder.mesaLateral;
            this.lampara = builder.lampara;
        }

        // Getters
        public int getSofa4() {
            return sofa4;
        }

        public int getSofa3() {
            return sofa3;
        }

        public int getSofa2() {
            return sofa2;
        }

        public int getSofa1() {
            return sofa1;
        }

        public boolean tieneMesaCentro() {
            return mesaCentro;
        }

        public boolean tieneMesaLateral() {
            return mesaLateral;
        }

        public boolean tieneLampara() {
            return lampara;
        }
    }
}
