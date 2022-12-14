package org.bedu;

public class ToppingDecorator implements Helado {

    private Helado _helado;
    private final int _costo = 20;

    public ToppingDecorator( Helado helado ) {
        this._helado = helado;
    }

    @Override
    public int getPrecio() {
        return this._helado.getPrecio() + this._costo;
    }

    @Override
    public String getDescripcion() {
        return this._helado.getDescripcion() + ", con topping extra";
    }
}
