package fabricas;

import abstraccion.*;
import modelos.BatidoChocolate;
import modelos.BrownieChocolate;
import modelos.GalletaChocolate;
import modelos.HeladoChocolate;
import modelos.HeladoFresa;

public class FabricaSaborChocolate implements FabricaSabores {

    int[] pedidosChocolate = null;

    @Override
    public HeladoChocolate[] devuelveHelado(int tamaño) {
        HeladoChocolate[] heladoLista = new HeladoChocolate[tamaño];

        for (int i = 0; i < tamaño; i++) {
            heladoLista[i] = new HeladoChocolate();
        }

        return heladoLista;
    }

    @Override
    public BrownieChocolate[] devuelveBrownie(int tamaño) {
        BrownieChocolate[] brownieLista = new BrownieChocolate[tamaño];

        for (int i = 0; i < tamaño; i++) {
            brownieLista[i] = new BrownieChocolate();
        }

        return brownieLista;
    }

    @Override
    public GalletaChocolate[] devuelveGalleta(int tamaño) {
        GalletaChocolate[] galletaLista = new GalletaChocolate[tamaño];

        for (int i = 0; i < tamaño; i++) {
            galletaLista[i] = new GalletaChocolate();
        }

        return galletaLista;
    }

    @Override
    public BatidoChocolate[] devuelveBatido(int tamaño) {
        BatidoChocolate[] batidoLista = new BatidoChocolate[tamaño];

        for (int i = 0; i < tamaño; i++) {
            batidoLista[i] = new BatidoChocolate();
        }

        return batidoLista;
    }

    public void recibePedidos(int[] lista) {
        pedidosChocolate = lista;
    }
}
