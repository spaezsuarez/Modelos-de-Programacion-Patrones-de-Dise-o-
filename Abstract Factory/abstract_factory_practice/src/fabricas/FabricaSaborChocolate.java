package fabricas;

import abstraccion.*;
import modelos.BatidoChocolate;
import modelos.BrownieChocolate;
import modelos.GalletaChocolate;
import modelos.HeladoChocolate;

/**
 *
 * @author spaezsuarez
 */
public class FabricaSaborChocolate implements FabricaSabores {
    
     @Override
    public Helado devuelveHelado() {
        return new HeladoChocolate();
    }

    @Override
    public Brownie devuelveBrownie() {
        return new BrownieChocolate();
    }

    @Override
    public Galleta devuelveGalleta() {
         return new GalletaChocolate();
    }

    @Override
    public Batido devuelveBatido() {
         return new BatidoChocolate();
    }
}
