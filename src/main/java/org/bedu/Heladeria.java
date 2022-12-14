package org.bedu;

public class Heladeria {

    public static void main(String [] args) {
        Helado superMegaEspecial = new HeladoSuave();
        superMegaEspecial = new CoberturaDecorator(superMegaEspecial);
        superMegaEspecial = new GalletaDecorator(superMegaEspecial);
        superMegaEspecial = new GranolaDecorator(superMegaEspecial);
        superMegaEspecial = new MermeladaDecorator(superMegaEspecial);
        superMegaEspecial = new ToppingDecorator(superMegaEspecial);

        System.out.println( "El helado: " + superMegaEspecial.getDescripcion() + ", cuesta: " + superMegaEspecial.getPrecio() );
    }
}