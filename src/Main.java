public class Main {
    public static void main(String[] args) {
        int numeroIf = -1;
        if (numeroIf==0){
            System.out.println("La variables es 0");
        } else if (numeroIf>0) {
            System.out.println("La variables es positiva");
        } else {
            System.out.println("La variables es negativa");
        }
        int numeroWhile = 0;
        while(numeroWhile < 3)  {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        int numeroDoWhile = 0;
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile<1);
        for (int numeroFor = 0; numeroFor<=3; numeroFor++) {
            System.out.println(numeroFor);

        }

        String estacion = "Otoño";

        switch(estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es ninguna estación");
                break;
        }

    }
}