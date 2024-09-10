public class OpMate {
    public static void main(String[] args) {
        double x=2.1;
        double y=3;

        //devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));

        //devuelve la raiz cuadrada de un numero
        System.out.println(Math.sqrt(y));

        //devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //devuelve el numero menor
        System.out.println(Math.min(x,y));

        //area de circulo    pi*r2
        System.out.println(Math.PI*Math.pow(y,2));

        //area de esfera     4*pi*r2
        System.out.println(4*Math.PI*Math.pow(y,2));

        //volumen de esfera   (4/3)*pi*r3
        System.out.println((4/3)*Math.PI*Math.pow(y,3));








    }
}
