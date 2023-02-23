package com.mayab.desarrollo.comportamiento.strategy;

import java.util.ArrayList;
import java.util.List;
abstract class Reporte {
    protected List<Articulo> articulos;
    protected Exportable exportable;

    public Reporte() {
        articulos = new ArrayList<>();
        exportable = new ExportarJSON(); // exportar a JSON
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void setExportable(Exportable exportable) {
        this.exportable = exportable;
    }

    public void exportar() {
        String reporteExportado = exportable.export(articulos);
        System.out.println(reporteExportado);
    }
}
