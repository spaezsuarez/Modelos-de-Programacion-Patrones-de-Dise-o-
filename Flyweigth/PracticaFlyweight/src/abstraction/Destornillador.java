package abstraction;

import models.Tornillo;

public interface Destornillador {
    
    String getTipoPunta();
    
    double getTamaño();
    
    String getMarca();

    void desatornillar(Tornillo tipoTornillo);
    
    
}
