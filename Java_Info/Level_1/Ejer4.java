import java.util.Scanner;
public class Ejer4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();
        int fac = 1;

        for (int i = 1; i <= num; i++) {
            fac *= i;
        }

        System.out.println("El factorial de "+num  +" es: " + fac);
        entrada.close();
    }
}

