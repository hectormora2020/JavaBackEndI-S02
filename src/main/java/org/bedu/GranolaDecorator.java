package org.bedu;

public class GranolaDecorator implements Helado {

    private final int _costoExtra = 10;
    private Helado _helado;

    public GranolaDecorator( Helado helado ) {
        this._helado = helado;
    }

    @Override
    public int getPrecio() {
        return this._helado.getPrecio() + this._costoExtra;
    }

    @Override
    public String getDescripcion() {
        return this._helado.getDescripcion() + ", con granola extra";
    }
}
