package GeneracionyEmisiondeEstadisticaseInformes.RankingConsumo;

/**
 * Created by juani9303 on 26/9/17.
 */

public class ConstructorImpresionRC implements IConstructorRankingConsumo {

    public ImpresorRC producto;

    public ConstructorImpresionRC (){};

    @Override
    public void construirReporteRanking() {
        this.producto = new ImpresorRC();
    }

    @Override
    public void construirEncabezado(String fechaDesde, String fechaHasta) {
        producto.setEncabezado("Ranking de propiedades con mayor consumo. Desde: " + fechaDesde +
                                " hasta: " + fechaHasta + ".");

    }

    @Override
    public void construirGrillaPropMayCons(String[][] grilla) {

    }

    @Override
    public void construirPiePagina() {

    }

    @Override
    public Object obtenerProducto() {
        return producto;
    }
}
