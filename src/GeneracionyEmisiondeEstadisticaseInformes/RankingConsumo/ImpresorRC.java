package GeneracionyEmisiondeEstadisticaseInformes.RankingConsumo;

/**
 * Created by juani9303 on 26/9/17.
 */
public class ImpresorRC {

    private String encabezado;
    private String pie;
    private String [][] grilla;

    public ImpresorRC () {}

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;

    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public void setGrilla(String[][] grilla) {
        this.grilla = grilla;
    }

    public void imprimir() {
        System.out.println("imprimiendo reporte...");
    }
}
