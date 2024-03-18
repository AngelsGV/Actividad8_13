package Caja;

public class CajaCarton extends Caja { // CajaCarton subclase de caja

    public CajaCarton(double ancho, double alto, double fondo, String unidad) {//Constructor
        // Llamada al constructor de la superclase
        super(ancho, alto, fondo, "cm"); //herencia igual que en caja :) esta en metros
    }

    //80% del volumen real y solo se da en cm. --> En el constructor lo hemos pasado a m
    @Override
    public double getVolumen() {

        double volumenReal = super.getVolumen(); //volumen real
        double volumen = volumenReal * 0.8;//volumen caja cartón
        return volumen;
    }

    // Redefinición del método toString para indicar el cartón total
    @Override
    public String toString() {

        double superficieTotal = (ancho * alto * 2) + (ancho * fondo * 2) + (alto * fondo * 2);

        return super.toString() + ", Superficie total de cartón utilizado: " + superficieTotal + " cm^2";
    }

    // Método para calcular la superficie total de cartón utilizado
    public double calcularSuperficieTotal() {
        // Calcular la superficie total de cartón utilizado para construir todas las cajas
        double superficieTotal = (ancho * alto * 2) + (ancho * fondo * 2) + (alto * fondo * 2);
        //formula de superficie total de una caja (SA) = 2lw+2lh+2hw
        return superficieTotal;
    }

}
//----------------------------------------------
//Problema: la entrada de caja de cartón solo puede permitir que se introduzcan los datos en m.