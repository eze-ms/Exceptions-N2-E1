public class Main {
    public static void main(String[] args) {
        byte nivell = Entrada.llegirByte("Introdueix el teu nivell");
        int edat = Entrada.llegirInt("Introdueix la teva edat");
        float alcada = Entrada.llegirFloat("Introdueix la teva alçada en metres");
        double pes = Entrada.llegirDouble("Introdueix el teu pes en quilograms");
        char caracter = Entrada.llegirChar("Introdueix un caràcter");
        String text = Entrada.llegirString("Introdueix un text");
        boolean question = Entrada.llegirSiNo("Vols continuar? Introdueix 's' per sí o 'n' per no");

        System.out.println("Final de l'aplicació. Gràcies per utilitzar-la!");
    }
}
