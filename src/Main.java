import java.security.SecureRandom;

public class Main {

    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAYUSCULAS = LETRAS_MINUSCULAS.toUpperCase();
    private static final String NUMEROS = "0123456789";
    private static final String OTROS_CARACTERES = "!@#$%&*()_+-=[]?";
    private static final String CARACTERES_PERMITIDOS = LETRAS_MINUSCULAS + LETRAS_MAYUSCULAS + NUMEROS + OTROS_CARACTERES;
    private static SecureRandom aleatorio = new SecureRandom();

    public static void main(String[] args) {
        int longitudContrasena = 12;

        for (int i = 1; i <= 5; i++) {
            String nombreVariable = "contraseña_" + i;
            String contraseñaGenerada = generarContrasena(longitudContrasena);
            System.out.println(nombreVariable + ": " + contraseñaGenerada);
        }
    }

    public static String generarContrasena(int longitud) {
        StringBuilder contraseña = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = aleatorio.nextInt(CARACTERES_PERMITIDOS.length());
            contraseña.append(CARACTERES_PERMITIDOS.charAt(indiceAleatorio));
        }
        return contraseña.toString();
    }
}
