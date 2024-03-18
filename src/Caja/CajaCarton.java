package Caja;

public class CajaCarton extends Caja { // CajaCarton subclase de caja

    public CajaCarton(double ancho, double alto, double fondo, String unidad) {//Constructor
        // Llamada al constructor de la superclase
        super(ancho, alto, fondo, unidad); //herencia igual que en caja :) esta en metros
    }

    //80% del volumen real y solo se da en cm.
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
        return superficieTotal;
    }

    // Programa de prueba
    public static void main(String[] args) {
        // Crear una instancia de CajaCarton
        CajaCarton cajaCarton = new CajaCarton(10, 20, 30, "cm");

        // Imprimir el volumen de la caja de cartón
        System.out.println("Volumen de la caja de cartón: " + cajaCarton.getVolumen() + " m^3");

        // Imprimir la representación de la caja de cartón
        System.out.println(cajaCarton);
    }
}
