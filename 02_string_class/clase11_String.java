public class clase11_String {

    /*STRING
     * 
     * No es un tipo primitivo, sino una clase.
     * Tiene sus propios métodos, son cientos.
     * 
     * más usados:
     * lenght() : Da la longitud de una cadena de carácteres.
     * charAt(n): entrega el carácter que se encuentra en tal posición
     * equals(Cadena) : Compara si dos cadenas son iguales o no (booleano)
     * equalsIgnoreCase : Igual a equals, pero ignora mayúsculas.
     */

    public static void main(String[] args) {

        String mi_nombre = "Claudio Garrido";
        System.out.println(mi_nombre.length()); //mi nombre tiene 15 carácteres.
        System.out.println(mi_nombre.charAt(1)); //entrega la posición 1 (Recuerda que el index parte de 0)

        /*Ejercicio */

        String var = "Leonardo";
        System.out.println("Mi nombre es "+var); //entrega nombre.
        System.out.println("Mi nombre tiene "+var.length()+" carácteres."); //entrega número de carácteres.
        System.out.println("La primera letra de mi nombre es \""+var.charAt(0)+ "\".");

        /*¿Cómo hacer que me den siempre la última letra, sin importar la longitud de la cadena. */

        int ultimaLetra;
        ultimaLetra = var.length(); //Dará la cantidad de letras, no parte de 0;
        System.out.println("La última letra del nombre es: "+var.charAt(ultimaLetra-1)); //recuerda que el conteo de posición empieza de 0;


        
    }
}