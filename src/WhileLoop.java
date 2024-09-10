public class WhileLoop {
    static boolean isTurnOnLight = true;

    public static void main(String[] args) {
    lamparaOnOff();
   int i=1;
    while (isTurnOnLight && i<=10){
        i++;
        printSOS();
    }


    }
    public static void printSOS(){
        System.out.println("...___...");
    }
    public static boolean lamparaOnOff() {
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
