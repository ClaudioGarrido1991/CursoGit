import javax.swing.JOptionPane;

public class clase15_entradaSalida {
    public static void main(String[] args) {
        


    String nombre = JOptionPane.showInputDialog("Introduzca su nombre: ");
    String edad = JOptionPane.showInputDialog("Introduzca su edad: ");

    int edadInt = Integer.parseInt(edad); //Convierte un String a Int.
    edadInt++; // aumenta el valor de edad en 1.

    System.out.println("Hola "+nombre+" Ud. tendrá el próximo año "+(edadInt)+" años."); //Genera una concatenación en edad porque edad es String.
    }
}
