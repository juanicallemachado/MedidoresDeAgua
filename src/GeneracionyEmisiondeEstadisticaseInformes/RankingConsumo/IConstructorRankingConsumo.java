package GeneracionyEmisiondeEstadisticaseInformes.RankingConsumo;

/**
 * Created by juani9303 on 26/9/17.
 */

public interface IConstructorRankingConsumo {

    public void construirEncabezado(String fechaDesde, String fechaHasta);
    public void construirGrillaPropMayCons(String [][] grilla);
    public void construirPiePagina();
    public void construirReporteRanking();
    public Object obtenerProducto();

}
