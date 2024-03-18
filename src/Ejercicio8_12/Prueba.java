package Ejercicio8_12;


public class Prueba {
    public static void main(String[] args) {
        Caja caja = new Caja(10, 20, 30, "cm");
        double volumen = caja.getVolumen();
        System.out.println("Volumen de la caja: " + volumen);

        caja.setEtiqueta("Nueva etiqueta para la caja");
        caja.imprimirEtiqueta();
    }
}


