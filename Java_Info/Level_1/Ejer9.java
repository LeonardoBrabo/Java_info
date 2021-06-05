import java.util.Scanner;
public class Ejer9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el texto: ");
        String texto = entrada.nextLine();

        System.out.print("Ingrese la letra que quiere contar: ");
        char letra = entrada.nextLine().charAt(0);

        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (letra == texto.charAt(i)) {
                cont = cont + 1;
            }
        }

        System.out.println("la letra " +letra +" aparece en el texto " +cont +" veces");
        entrada.close();
    }
}
