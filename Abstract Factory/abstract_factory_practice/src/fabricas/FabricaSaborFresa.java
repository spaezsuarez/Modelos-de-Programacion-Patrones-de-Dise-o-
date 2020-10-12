package fabricas;

import abstraccion.*;
import modelos.*;


public class FabricaSaborFresa implements FabricaSabores {

    @Override
    public Helado devuelveHelado() {
        return new HeladoFresa();
    }

    @Override
    public Brownie devuelveBrownie() {
        return new BrownieFresa();
    }

    @Override
    public Galleta devuelveGalleta() {
         return new GalletaFresa();
    }

    @Override
    public Batido devuelveBatido() {
         return new BatidoFresa();
    }
    
}
