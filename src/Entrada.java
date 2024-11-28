import java.util.Scanner;
import java.util.InputMismatchException;

public class Entrada {

    private static Scanner scanner = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        byte valorByte = 0;
        boolean correcte = false;

        while (!correcte) {
            try {
                System.out.println(missatge + " (valor esperat: un byte entre -128 i 127 i prem ENTER)");
                valorByte = scanner.nextByte();
                scanner.nextLine(); // Limpia el búfer
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Introdueix un valor correcte per a un byte.");
                scanner.nextLine(); // Limpia el búfer en caso de error
            }
        }
        return valorByte;
    }

    public static int llegirInt(String missatge) {
        int valorInt = 0;
        boolean correcte = false;

        while (!correcte) {
            try {
                System.out.println(missatge + " (valor esperat: un número enter i prem ENTER)");
                valorInt = scanner.nextInt();
                scanner.nextLine(); // Limpia el búfer
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Introdueix un valor correcte per a un enter.");
                scanner.nextLine(); // Limpia el búfer en caso de error
            }
        }
        return valorInt;
    }

    public static float llegirFloat(String missatge) {
        float valorFloat = 0.0f;
        boolean correcte = false;

        while (!correcte) {
            try {
                System.out.println(missatge + " (Valor esperat: un número decimal amb coma com a separador i prem ENTER)");
                valorFloat = scanner.nextFloat();
                scanner.nextLine(); // Limpia el búfer
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Introdueix un valor correcte per a un decimal.");
                scanner.nextLine(); // Limpia el búfer en caso de error
            }
        }
        return valorFloat;
    }


    public static double llegirDouble(String missatge) {
        double valorDouble = 0.0;
        boolean correcte = false;

        while (!correcte) {
            try {
                System.out.println(missatge + " (valor esperat: un número decimal doble amb punt com a separador i prem ENTER)");
                String entrada = scanner.nextLine().trim();
                valorDouble = Double.parseDouble(entrada);
                correcte = true;
            } catch (NumberFormatException e) {
                System.out.println("Error de format. Introdueix un valor correcte per a un decimal doble.");
            }
        }
        return valorDouble;
    }

    public static char llegirChar(String missatge) throws FormatInvalidException {
        char resultat = '\0';
        boolean correcte = false;

        while (!correcte) {
            System.out.println(missatge + " (Introdueix un únic caràcter i prem ENTER)");
            String entrada = scanner.nextLine();
            if (entrada.length() != 1) {
                throw new FormatInvalidException("Error de format. Introdueix un únic caràcter.");
            }
            resultat = entrada.charAt(0);
            correcte = true;
        }
        return resultat;
    }

    public static String llegirString(String missatge) throws FormatInvalidException {
        String resultat = "";
        boolean correcte = false;

        while (!correcte) {
            System.out.println(missatge + " (Introdueix un text no buit i prem ENTER)");
            resultat = scanner.nextLine();
            if (resultat.trim().isEmpty()) {
                throw new FormatInvalidException("Error de format. El text no pot estar buit.");
            }
            correcte = true;
        }
        return resultat;
    }

    public static boolean llegirSiNo(String missatge) throws FormatInvalidException {
        boolean resultat = false;
        boolean correcte = false;

        while (!correcte) {
            System.out.println(missatge + " (Introdueix 's' per sí o 'n' per no i prem ENTER)");
            String entrada = scanner.nextLine().toLowerCase();
            if (entrada.equals("s")) {
                resultat = true;
                correcte = true;
            } else if (entrada.equals("n")) {
                resultat = false;
                correcte = true;
            } else {
                throw new FormatInvalidException("Error de format. Només es permet 's' o 'n'.");
            }
        }

        return resultat;
    }
}
