public class Main {
    public static void main(String[] args) {
        try {
            byte nivell = Entrada.llegirByte("Introdueix el teu nivell");
            System.out.println("Has introduït el nivell: " + nivell);
        } catch (Exception e) {
            System.out.println("Error en nivell: " + e.getMessage());
        }
        System.out.println();

        try {
            int edat = Entrada.llegirInt("Introdueix la teva edat");
            System.out.println("Has introduït l'edat: " + edat);
        } catch (Exception e) {
            System.out.println("Error en edat: " + e.getMessage());
        }
        System.out.println();

        try {
            float alcada = Entrada.llegirFloat("Introdueix la teva alçada en metres");
            System.out.println("Has introduït l'alçada: " + alcada);
        } catch (Exception e) {
            System.out.println("Error en alçada: " + e.getMessage());
        }
        System.out.println();

        try {
            double pes = Entrada.llegirDouble("Introdueix el teu pes en quilograms");
            System.out.println("Has introduït el pes: " + pes);
        } catch (Exception e) {
            System.out.println("Error en pes: " + e.getMessage());
        }
        System.out.println();

        try {
            char caracter = Entrada.llegirChar("Introdueix un caràcter");
            System.out.println("El caràcter que has introduït és: " + caracter);
        } catch (FormatInvalidException e) {
            System.out.println("Error en caràcter: " + e.getMessage());
        }
        System.out.println();

        try {
            String text = Entrada.llegirString("Introdueix un text");
            System.out.println("El text que has introduït és: " + text);
        } catch (FormatInvalidException e) {
            System.out.println("Error en text: " + e.getMessage());
        }
        System.out.println();

        try {
            boolean question = Entrada.llegirSiNo("Vols continuar? Introdueix 's' per sí o 'n' per no");
            System.out.println("L'opció que has elegit és: " + (question ? "Sí" : "No"));
        } catch (FormatInvalidException e) {
            System.out.println("Error en la pregunta Sí/No: " + e.getMessage());
        }
        System.out.println();
    }
}
