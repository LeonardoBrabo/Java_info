import java.util.Scanner;
public class Ejer5 {
    public static void main(String[] args) {
        java.util.Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num1 = entrada.nextInt();
        System.out.print("ingrese un numero por el que quiera multiplicar "+num1 +" : ");
        int num2 = entrada.nextInt();

        int mult = 0;
        for (int i = 0; i < num2; i++) {
            mult = mult + num1;
        }

        System.out.println("El resultado es: " + mult);
        entrada.close();
    }
}

