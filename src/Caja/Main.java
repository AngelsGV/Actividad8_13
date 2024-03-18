package Caja;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Crear Caja
        Caja caja = new Caja(10, 20, 30, "cm");

        // Modificar la etiqueta
        caja.setEtiqueta("Caja de prueba");

        // Sacar la etiqueta de la caja
        caja.imprimirEtiqueta();

        // Imprimir la representación de la caja
        System.out.println(caja);

        // Calcular y mostrar el volumen de la caja
        System.out.println("Volumen de la caja: " + caja.getVolumen() + "m^3");

        // Crear una instancia de CajaCarton
        CajaCarton cajaCarton = new CajaCarton(10, 20, 30, "cm");

        // Imprimir el volumen de la caja de cartón
        System.out.println("Volumen de la caja de cartón: " + cajaCarton.getVolumen() + " m^3");

        // Imprimir la representación de la caja de cartón
        System.out.println(cajaCarton);
    }
}