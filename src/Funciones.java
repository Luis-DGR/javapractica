public class Funciones {
    public static void main(String[] args) {
        double y=3;
      double area= circleArea(y);
        System.out.println(area);

        double pesos= 20.0;
        String moneda= "MXN";
        double cambio= converToDolar(pesos,moneda);
        System.out.println(cambio);

    }
    public static double circleArea(double r){
        return Math.PI*Math.pow(r,2);

    }
/** Descripcion: Ffuncion que especificando su moneda convierte una cantidad de dinero a dolares
 *
 * @param quantity cantidad de dinero
 * @param currency Tipo de moneda: Solo acepta MXN o COP
 * @return Devuelve la cantidad actualizada en dolares
 * */
    public static double converToDolar(double quantity, String currency ){
        switch (currency){
            case "MXN":
                quantity= quantity* 0.052;
                break;
            case "COP":
                quantity=quantity*.00031;
                break;
        }
        return quantity;
    }
}
