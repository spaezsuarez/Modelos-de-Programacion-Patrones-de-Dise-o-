package fabricas;

import abstraccion.*;
import modelos.*;

public class FabricaSaborFresa implements FabricaSabores {

    int[] pedidosFresa = null;

    @Override
    public HeladoFresa[] devuelveHelado(int tamaño) {

        HeladoFresa[] heladoLista = new HeladoFresa[tamaño];

        for (int i = 0; i < tamaño; i++) {
            heladoLista[i] = new HeladoFresa();
        }

        return heladoLista;
    }

    @Override
    public BrownieFresa[] devuelveBrownie(int tamaño) {
        BrownieFresa[] brownieLista = new BrownieFresa[tamaño];

        for (int i = 0; i < tamaño; i++) {
            brownieLista[i] = new BrownieFresa();
        }

        return brownieLista;
    }

    @Override
    public GalletaFresa[] devuelveGalleta(int tamaño) {
        GalletaFresa[] galletaLista = new GalletaFresa[tamaño];

        for (int i = 0; i < tamaño; i++) {
            galletaLista[i] = new GalletaFresa();
        }

        return galletaLista;
    }

    @Override
    public BatidoFresa[] devuelveBatido(int tamaño) {
        BatidoFresa[] batidoLista = new BatidoFresa[tamaño];

        for (int i = 0; i < tamaño; i++) {
            batidoLista[i] = new BatidoFresa();
        }

        return batidoLista;
    }

    public void recibePedidos(int[] lista) {
        pedidosFresa = lista;
    }

}
