package Ejercicio8_12;

public class Caja {
    // Definición de parámetros
    //Por el momento no no les pongo modificador de visibilidad,
    // pero después debería poner protected para que las clases vecinas los puedan usar.
    double ancho;
    double alto;
    double fondo;
    String etiqueta;

    //Uso double porque m y cm puede estar definido en decimal
    Caja(double ancho, double alto, double fondo, String unidad ){//constructor caja
//lo de la unidad lo he buscado. También lo podría hacer con unidad.toLowerCase().equals("cm"))
        if (unidad.equalsIgnoreCase("cm")) {
            //comparamos 2 cadenas de caracteres ignorando mayusculas y minusculas.

            this.ancho = ancho / 100;  // Convertir de cm a m
            this.alto = alto / 100;
            this.fondo = fondo / 100;
        } else if (unidad.equalsIgnoreCase("m")) {
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
        } else {
            //Caso invalido.
            System.out.println("Unidad no válida. Utilice 'cm' o 'm'.");

            this.ancho = 0;
            this.alto = 0;
            this.fondo = 0;
        }
        this.etiqueta = ""; //definimos también la etiqueta como vacío.
    }

    public double getVolumen() {
        double volumen = ancho*alto*fondo;
        return volumen;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        } else {
            System.out.println("La etiqueta excede los 30 caracteres.");
        }
    }

    public void imprimirEtiqueta() {
        if (!this.etiqueta.isEmpty()) {
            System.out.println("Etiqueta:");
            System.out.println(this.etiqueta);
        } else {
            System.out.println("La caja no tiene etiqueta.");
        }
    }

    @Override
    public String toString() {
        return String.format("Caja de dimensiones: " + ancho +" x "+ alto +" x " + fondo +", Etiqueta: " + etiqueta,
                this.ancho, this.alto, this.fondo, this.etiqueta);
    }
}