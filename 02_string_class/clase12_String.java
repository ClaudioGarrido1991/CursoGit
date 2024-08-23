public class clase12_String {

    public static void main(String[] args) {
        
        String frase = "Hoy es un estupendo día para aprender a programar en java.";
        System.out.println(frase.length());

        String frase_resumen = frase.substring(0,37); //declaro la variable "frase_resumen" y le asigno un fragmento de texto.
        System.out.println(frase_resumen);

        String frase_resumen2 = frase.substring(38, 58);//Crea un segundo fragmento, el endIndex lo obtengo del "length" de frase.
        System.out.println(frase_resumen2); 

        System.out.println(frase_resumen+frase_resumen2); //concatena ambos.

        /*Segundo ejercicio. EQUALS */

        String alumno1, alumno2; //declaro sin iniciar.

        alumno1 = "Claudio"; //Ambas son el mismo nombre pero uno con mayus y otro sin mayus.
        alumno2 = "claudio";

        System.out.println(alumno1.equalsIgnoreCase(alumno2)); //Es booleano, da true si son iguales e ignora mayúsculas y minusculas.
        System.out.println(alumno1.equals(alumno2)); //discrimina mayúsculas

    }
}