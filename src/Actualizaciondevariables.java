public class Actualizaciondevariables {
    public static void main(String[] args) {
        int salary = 1000;
        int bono=200;
        int pension= 50;
        int pagoPorHoraExtra=50;
        int NumerDeHorasExtra=2;
        int pagoextratotal= pagoPorHoraExtra*NumerDeHorasExtra;
        String nombre="Luis Garcia";



        //bono 200
        salary += bono+pagoextratotal;
        salary-= pension;

        System.out.println(nombre+ " Gano " + salary +  " pesos despues de pagar pension");


    }
}
