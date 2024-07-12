package operadores;

/*
    * && -> AND -> E
    * || -> OR -> OU
    * ! -> NOT -> NÃO

    sempre retorna um boolean
 */

public class Logicos {
    public static void main(String[] args) {

        final var numero = 2;
        final var letra = "A";

        // Sort Circuit
        if (numero < 5 && letra.equals("A")) {
            System.out.println("Atendeu a condição");
        }

        if (numero < 5 || letra.equals("A")) {
            System.out.println("Atendeu a outra condição");
        }

        if ((10 - 5) > 1 && (5 - 3) > 1) {
            System.out.println("Lógica maluca...");
        }

        // Non Sort Circuit
        if (verifica(String.valueOf(15)) | verifica("A")) {
            System.out.println("OK");
        } else {
            System.out.println("Não OK");
        }
    }

    private static boolean verifica(String a) {
        return false;
    }
}
