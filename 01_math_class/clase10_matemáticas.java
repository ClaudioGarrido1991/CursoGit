public class clase10_matemáticas {

    public static void main(String[] args) {
        
        // int raiz = Math.sqrt(25);

        /* float num1 = 5.85f;

        int resultado = Math.round(num1);
        System.out.println(resultado);*/

        double num1 = 5.85;
        int resultado = (int) Math.round(num1);
        System.out.println(resultado);

        double base = 10;
        double exponente = 2;

        int resultado2 = (int)Math.pow(base, exponente); //para que no de error se debe castear.
        System.out.println(resultado2);

    }
}