import java.util.*;

public class clase16_CondicionalesBucles {

    /*Condicionales y bucles.
     * IF ELSE / ELSE IF
     * Modifican el flujo de ejecuación de las líneas del programa.
     * 
     * Existe GOTO y GOSUB, que sirve para dar saltos en el programa,
     * pero se desaconseja porque produce código espaguetti.
     */

    public static void main(String[] args) {

        Scanner Entrada = new Scanner (System.in); //Constructor Scanner, Crea Instancia Entrada.
        System.out.println("Introduce tu edad: "); //Solicita introducir edad.
        int edad = Entrada.nextInt(); // Asigna el valor de Entrada a la variable edad.


        /*If-Else */

        /*if (edad>=18){
        System.out.println("Usted es mayor de edad.");
        }else{
        System.out.println("Usted es menor de edad.");
        }*/
        if (edad<=3){
            System.out.println("Eres un bebé.");
        }
        else if (edad<8){
            System.out.println("Eres un niño.");
        }
        else if(edad<18) {
            System.out.println("Eres Adolescente.");
        }
        else if (edad>=18 && edad<65){ //aquí utilice ampersand para indicar que hay dos condiciones.
            System.out.println("Eres un adulto.");
        }
        else if (edad>=65){
            System.out.println("Eres un anciano.");
        }



        /*Switch-default */
        
        
    
    Entrada.close();
    }
    
}
