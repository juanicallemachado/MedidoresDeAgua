package GeneracionyEmisiondeEstadisticaseInformes.RankingConsumo; /**
 * Created by juani9303 on 26/9/17.
 */

import java.time.LocalDateTime;

public class DirectorRankingConsumo {

    private IConstructorRankingConsumo constructor;

    public DirectorRankingConsumo (IConstructorRankingConsumo constructor) {
        this.constructor = constructor;

    }

    public void construir(LocalDateTime fechaDesde, LocalDateTime fechaHasta, String [] filtrosAplicados, String [][] grillaDatosPropMayCons) {

    }
}
