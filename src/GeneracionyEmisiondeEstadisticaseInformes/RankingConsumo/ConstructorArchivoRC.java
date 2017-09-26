package GeneracionyEmisiondeEstadisticaseInformes.RankingConsumo;

/**
 * Created by juani9303 on 26/9/17.
 */
public class ConstructorArchivoRC implements IConstructorRankingConsumo {

    ArchivoRC producto;


    @Override
    public void construirEncabezado(String fechaDesde, String fechaHasta) {

    }

    @Override
    public void construirGrillaPropMayCons(String[][] grilla) {

    }

    @Override
    public void construirPiePagina() {

    }

    @Override
    public void construirReporteRanking() {
        this.producto = new ArchivoRC();
    }

    @Override
    public Object obtenerProducto() {
        return null;
    }
}
