/*IGU : Interfaz grafica Usuario.
 * 
 * Que un método sea estatico significa que se debe usar el nombre de la clase antes del método.
 */

//import javax.swing.*; //para usar JOptionPane.

import java.util.Scanner;

public class clase14_entradaSalida {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner (System.in); //Constructor de Scanner

        /*Nombre */
        System.out.println("Introduzca su nombre: ");
        String nombre = Sc.nextLine(); //Declara e inicializa variable nombre
        System.out.println("Su nombre es "+nombre+"."); //Saca por consola variable nombre

        /*Edad */
        System.out.println("Introduzca su edad: ");
        int edad = Sc.nextInt();
        System.out.println("Su edad es "+edad+" años.");
        System.out.println("El proximo año tendrá "+(edad+1)+" años.");

        Sc.close();

    }
}