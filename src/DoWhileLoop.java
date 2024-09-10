import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response=0;
        do {
            System.out.println("selecciona");
            System.out.println("1.Movie");
            System.out.println("2.Movie");
            System.out.println("0.Movie");

            Scanner sc= new Scanner(System.in);
            response= Integer.valueOf(sc.nextLine());
            switch (response){
                case 0:
                    System.out.println("gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("peliculas");
                    break;
                case 3:
                    System.out.println("series");
                    break;
                default:
                    System.out.println("selecciona");


            }


        }while (response != 0);
    }
}
