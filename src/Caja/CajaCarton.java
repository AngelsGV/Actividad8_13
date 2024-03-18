package Caja;

public class CajaCarton extends Caja { // CajaCarton subclase de caja

    public CajaCarton(double ancho, double alto, double fondo, Unidad unidad) {//Constructor
        // Llamada al constructor de la superclase
        super(ancho, alto, fondo, Unidad.cm); //herencia igual que en caja :)
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

        double superficieTotal = (2 * ancho * alto ) + (2 * ancho * fondo) + (2 * alto * fondo);

        return super.toString() + ", Superficie total de cartón utilizado: " + superficieTotal + " cm^2";
    }


}
//----------------------------------------------
//Problema: la entrada de caja de cartón solo puede permitir que se introduzcan los datos en m.
//Le he dado tantas vueltas que ya no sé en que unidades va el progtama. Otro día lo miraré.
//Lo demás OK.