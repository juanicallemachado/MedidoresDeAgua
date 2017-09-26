
package GeneracionyEmisiondeEstadisticaseInformes.RankingConsumo;

/**
 * Created by juani9303 on 26/9/17.
 */

import java.time.LocalDateTime;

public class GestorRankingConsumo {

    private LocalDateTime fechaHoraDesde;
    private LocalDateTime fechaHoraHasta;
    private String [] zonasSeleccionadas;
    private String [] categoriasSeleccionadas;
    private String [][] grillaDatosPropMayorConsumo;

    public static final byte IMPRIMIR = 0;
    public static final byte GUARDAR_EN_ARCHIVO = 1;
    public static final byte MOSTRAR_POR_PANTALLA = 2;

    public GestorRankingConsumo(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta, String [] zonasSeleccionadas,
                                String [] categoriasSeleccionadas, String [][] grillaDatosPropMayorConsumo) {
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.zonasSeleccionadas = zonasSeleccionadas;
        this.categoriasSeleccionadas = categoriasSeleccionadas;
        this.grillaDatosPropMayorConsumo = grillaDatosPropMayorConsumo;

    }

    public void tomarFormaVisualizacion(byte seleccion) {
        switch (seleccion) {
            case IMPRIMIR: imprimirReporte();
            case GUARDAR_EN_ARCHIVO: guardarReporteEnArchivo();
            case MOSTRAR_POR_PANTALLA: mostrarPorPantalla();
            }
    }

    public void imprimirReporte() {
        ConstructorImpresionRC constructor = new ConstructorImpresionRC();
        DirectorRankingConsumo director = new DirectorRankingConsumo(constructor);
        director.construir(fechaHoraDesde, fechaHoraHasta, new String[] {zonasSeleccionadas.toString(),
                categoriasSeleccionadas.toString()}, grillaDatosPropMayorConsumo);
        ((ImpresorRC) constructor.obtenerProducto()).imprimir();
    }

    public void mostrarPorPantalla() {
        return;
    }

    public void guardarReporteEnArchivo() {

    }


}
