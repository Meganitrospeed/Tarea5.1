import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class contraseña {
    public static void main(String[] args) {
    int Intentos = 0;
    Pattern contrasena = Pattern.compile("acde245");
    Scanner teclado = new Scanner(System.in);
    while (Intentos <3) {
            System.out.println("Introduce tu contraseña");
            contrasena = Pattern.compile(teclado.nextLine());
            Intentos++;
        }
    if (Intentos>3) {
        System.out.println("Demasiados intentos, se procede a cerrar el programa por seguridad");
        System.exit(1);
    }
    }
}
