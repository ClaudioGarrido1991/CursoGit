import javax.swing.JOptionPane;

public class clase15_entradaSalida_2 {
    public static void main(String[] args) {

        double num1 = 10000000.0;

        System.out.println(num1/3); //muchos decimales.
        System.out.printf("%1.2f", num1/3); //formatea los números y permite decidir cuantos decimales muestra.

        String num2 = JOptionPane.showInputDialog("Ingresa tu edad: ");

        double num3 = Double.parseDouble(num2); //Crea una nueva variable (num3) esta vez como double y le asigna el valor de num2.
        num3++; //aumenta en 1 el valor de num3.

        System.out.printf("La raíz cuadrada de "+num3+" es "+"%1.2f", Math.sqrt(num3)); //Acorto los decimales.
    }


}