package Caja;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Caja
        Caja caja = new Caja(10, 20, 30, "cm");

        // Establecer una etiqueta para la caja
        caja.setEtiqueta("Caja de prueba");

        // Imprimir la etiqueta de la caja
        caja.imprimirEtiqueta();

        // Imprimir la representación de la caja
        System.out.println(caja);

        // Calcular y mostrar el volumen de la caja
        System.out.println("Volumen de la caja: " + caja.getVolumen() + "m^3");
    }
}