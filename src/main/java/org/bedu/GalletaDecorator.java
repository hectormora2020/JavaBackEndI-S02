package org.bedu;

public class GalletaDecorator implements Helado {

    private Helado _helado;
    private final int _costoExtra = 15;

    public GalletaDecorator( Helado helado ) {
        this._helado = helado;
    }

    @Override
    public int getPrecio() {
        return this._helado.getPrecio() + this._costoExtra;
    }

    @Override
    public String getDescripcion() {
        return this._helado.getDescripcion() + ", con galleta extra";
    }

}
