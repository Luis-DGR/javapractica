public class Switch {
    public static void main(String[] args) {
        String colorModeSELECTED="0";
        switch (colorModeSELECTED){
            case "light":
                System.out.println("seleccionaste light mode");
                break;
            case "nigth":
                System.out.println("seleccionaste night mode");
                break;
            case "Dark":
                System.out.println("seleccionaste Dark mode");
                break;
            default:
                System.out.println("selecciona");
        }
    }
}
