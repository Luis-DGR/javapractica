public class BucleFor {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        lamparaOnOff();
        for (int i = 0; i <=100 ; i++) {
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
