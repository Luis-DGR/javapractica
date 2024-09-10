public class Casting {
    public static void main(String[] args) {

        //En Java, el casting es el proceso de convertir un valor de un tipo de dato a otro.
        int numeroEntero1 = 42;
        double numeroDecimal = numeroEntero1; // Cast implícito de int a double
        System.out.println(numeroDecimal); // Imprime 42.0

        //Es necesario cuando conviertes un tipo de dato de mayor capacidad a uno de menor capacidad.
        double numeroDecimal2 = 42.99;
        int numeroEntero = (int) numeroDecimal2; // Cast explícito de double a int
        System.out.println(numeroEntero); // Imprime 42, truncando la parte decimal

    }
}
