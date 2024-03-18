package Caja;

public class Caja {
    // Definición de parámetros
    //Por el momento no no les pongo modificador de visibilidad,
    // pero después debería poner protected para que las clases vecinas los puedan usar.
    protected double ancho, alto, fondo;
     protected String etiqueta;

    //Uso double porque m y cm puede estar definido en decimal
    Caja(double ancho, double alto, double fondo, String unidad ){//constructor caja
//lo de la unidad lo he buscado. También lo podría hacer con unidad.toLowerCase().equals("cm"))
        if (unidad.equalsIgnoreCase("cm")) {
            //comparamos 2 cadenas de caracteres ignorando mayusculas y minusculas.
            //Convertir de cm a m para despues el getVolumen() en m^3
            this.ancho = ancho / 100;
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
        if (etiqueta.length() <= 30) { //igual o menor que 30 caracteres
            this.etiqueta = etiqueta;
        } else {//Si tiene más.
            System.out.println("La etiqueta excede los 30 caracteres.");
        }
    }

    public void imprimirEtiqueta() { //pese que no me lo pide directamente,
        // es necesario este método para sacar la etiqueta.
        if (!this.etiqueta.isEmpty()) {//Si hay etiqutea
            System.out.println("Etiqueta:");
            System.out.println(this.etiqueta);
        } else {
            System.out.println("La caja no tiene etiqueta.");
        }
    }

    @Override
    public String toString() { //En este metodo no estoy muy segura de como lo quieres,
        // por lo que te muestro directamente los elementos

    return "Dimensiones: " + ancho + " x " + alto + " x " + fondo + ", Etiqueta: " + etiqueta;
    }
}

//--------------------------------------------
// Estoy super atascada, creo que la clase esta más o menos correcta, pero a la hora de ubicar archivos o
// hacer pruebas el programa me marca los siguientes errores:

//"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.3\lib\idea_rt.jar=63377:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 Ejercicio8_12.Prueba
//Error: Could not find or load main class Ejercicio8_12.Prueba
//Caused by: java.lang.ClassNotFoundException: Ejercicio8_12.Prueba
//
//Process finished with exit code 1

//Resolucio: dia 18/3/24. Cree otro archivo, copie tal cual y funciona :D
