package org.bedu;

public class HeladoSuave  implements  Helado{

    private final int _costo = 30;
    @Override
    public String getDescripcion() {
        return "Helado Suave";
    }
    @Override
    public int getPrecio() {
        return this._costo;
    }
}
