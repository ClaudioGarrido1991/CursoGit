import java.util.Scanner;
import javax.swing.JOptionPane;

/*Condicionales y bucles II.
 * Switch.
 * 
 * Áreas cuadrado, rectángulo, triángulo, circulo.
 * (Círculo se calcula PI* radio al cuadrado.)
 */

//modificación.
public class clase17_CondicionalesBucles_2 {

    /*Constante PI */
    //String Math.PI; NO SE DECLARA YA QUE ES UNA VARIABLE ESTÁTICA.

    public static void main(String[] args) {
        
        
        try (Scanner Selección = new Scanner (System.in) //Constructor Scanner, instancia Selección.
        ) {
            System.out.println("Elige una opción: \n1: Cuadrado. \n2: Rectángulo. \n3: Triángulo. \n4: Círculo.");
            
            int figura = Selección.nextInt();
            
            /*Switch */
            switch (figura){
                
                case 1 -> {
                    int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado (cms.)"));
                    System.out.println("El área del cuadrado es: "+Math.pow(lado,2)+"cms².");
                }
                
                case 2 -> {
                    int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor (cms.) de la base del rectángulo.","Ingrese base"));
                    int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor (cms.) de la altura.", "Ingrese altura"));
                    System.out.println("El área del rectángulo es: "+(base*(altura))+"cms².");
                }
                
                case 3 -> {
                    int baseTriángulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor (cms.) de la base del triángulo.","ingrese base"));
                    int alturaTriángulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor (cms.) de la altura del triángulo.","ingrese altura"));
                    System.out.println("El área del triángulo es: "+(baseTriángulo*(alturaTriángulo/2))+"cms².");
                }
                
                case 4 -> {
                    int radioCírculo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor (cms.) del radio del círculo.","ingrese radio"));
                    double áreaCírculo = Math.pow(radioCírculo, 2)*Math.PI;
                    System.out.printf("El área del círculo es: %.2f cm²%n", áreaCírculo); //%n adiciona un salto de línea.
                }
                
                default -> System.out.println("La opción ingresada no es válida.");
                
                
                
            }
            /*Cuadrádo (base*altura) */
            /*Rectángulo (base*altura) */
            /*Triángulo (base*(altura/2))*/
            /*Círculo */
            /*No valido */
        }
    }
}