import java.util.Scanner; //Directiva import, se usa para importar parquetes o clases.
//import java.util.*; //Importa el paquete completo, esto utiliza más memoria.

public class clase13_api {
    /*NOTAS
     * 
     * Java.lang : Se considera el paquete Java por defecto o paquete principal.
     */
    
    public static void main(String[] args) {

        String nombre; //no hay problemas en utilizar l|a clase String porque esta incluida en Java.lang;
        nombre = "Claudio";
        System.out.println(nombre);

        Scanner myScanner = new Scanner (System.in); //necesita importar java. util. Scanner;
        int var = myScanner.nextInt(); //Para invocar un método debes agregar (), sino no funciona;
        System.out.println(var);

        myScanner.close();

        //esta es una segunda modificación
        //tercera modificación
        //Edición desde GitHub
        //Edición desde VSC
        //Este comentario fue hecho en la rama "CLAUDIO"
        
    }
}
