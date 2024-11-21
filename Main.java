import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Character> morse_ascii = new HashMap<>();
        morse_ascii.put(".-", 'a');
        morse_ascii.put("-...", 'b');
        morse_ascii.put("-.-.", 'c');
        morse_ascii.put("-..", 'd');
        morse_ascii.put(".", 'e');
        morse_ascii.put("..-.", 'f');
        morse_ascii.put("--.", 'g');
        morse_ascii.put("....", 'h');
        morse_ascii.put("..", 'i');
        morse_ascii.put(".---", 'j');
        morse_ascii.put("-.-", 'k');
        morse_ascii.put(".-..", 'l');
        morse_ascii.put("--", 'm');
        morse_ascii.put("-.", 'n');
        morse_ascii.put("--.--", 'ñ');
        morse_ascii.put("---", 'o');
        morse_ascii.put(".--.", 'p');
        morse_ascii.put("--.-", 'q');
        morse_ascii.put(".-.", 'r');
        morse_ascii.put("...", 's');
        morse_ascii.put("-", 't');
        morse_ascii.put("..-", 'u');
        morse_ascii.put("...-", 'v');
        morse_ascii.put(".--", 'w');
        morse_ascii.put("-.--", 'y');
        morse_ascii.put("-..-", 'x');
        morse_ascii.put("--..", 'z');
        morse_ascii.put("......", ' ');
        morse_ascii.put("-----", '0');
        morse_ascii.put(".----", '1');
        morse_ascii.put("..---", '2');
        morse_ascii.put("...--", '3');
        morse_ascii.put("....-", '4');
        morse_ascii.put(".....", '5');
        morse_ascii.put("-....", '6');
        morse_ascii.put("--...", '7');
        morse_ascii.put("---..", '8');
        morse_ascii.put("----.", '9');
        morse_ascii.put("-.-.--", '!');
        morse_ascii.put("..--..", '?');
        morse_ascii.put("--..--", ',');
        morse_ascii.put(".-.-.-", '.');
        morse_ascii.put("---...", ':');
        morse_ascii.put("-.--.", '(');
        morse_ascii.put("-.--.-", ')');
        morse_ascii.put(".--.-.", '@');
        morse_ascii.put("...-..-", '$');
        morse_ascii.put(".-...", '&');
        morse_ascii.put("-..-.", '/');
        morse_ascii.put("-...-", '=');
        morse_ascii.put(".-.-.", '+');
        morse_ascii.put("-....-", '-');
        morse_ascii.put("..--.-", '_');

        String frase = ".... --- .-.. .- --..-- ...... -- ..- -. -.. ---";
        String[] cadaChar = frase.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        try {

            for (String s : cadaChar) {
                for (Map.Entry<String, Character> entry : morse_ascii.entrySet()) {
                    if (s.equals(entry.getKey())) {
                        stringBuilder.append(entry.getValue());
                    }
                }
            }
            System.out.println("Traducción de sihao: " + stringBuilder.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }

        // -- cami -- como necesito hacerlo al reves tengo que crear un nuevo mapa que sea como el de mi codigo

        HashMap<Character, String> mapaMorse = new HashMap<>();
        for (Map.Entry<String, Character> entry : morse_ascii.entrySet()) {
            mapaMorse.put(Character.toLowerCase(entry.getValue()), entry.getKey());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué deseas pasar a código morse?");
        String textoIntroducido = sc.nextLine();
        textoIntroducido = textoIntroducido.toLowerCase();

        StringBuilder morse = new StringBuilder();

        for (char letra : textoIntroducido.toCharArray()) {
            String codigoMorse = mapaMorse.get(letra);

            if (codigoMorse != null) {
                morse.append(codigoMorse).append(" ");
            }
        }

        System.out.println(morse.toString().trim());
        sc.close();
    }
}
