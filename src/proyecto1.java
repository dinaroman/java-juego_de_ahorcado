import java.util.Scanner;

public class proyecto1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 5;
        int intentosIniciales = 0;
        boolean palabraAdivinada = false;

        // arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentosIniciales < intentosMaximos) {
            System.out.println("Palabra a adivinar:" + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length()
                    + " letras)");
            System.out.println("Introduce una letra, por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }

            if (!letraCorrecta) {
                intentosIniciales++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentosIniciales) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, haz adivinado la palabra! La pabra era : " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("¡Te haz quedado sin intentos! :(");
        }

        scanner.close();
    }
}
