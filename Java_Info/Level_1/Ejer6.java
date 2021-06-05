import java.util.Scanner;
public class Ejer6 {
    
    public static void main(String[] args) {
        java.util.Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num1 = entrada.nextInt();
        System.out.print("ingrese un numero como exponente para "+num1 +" : ");
        int num2 = entrada.nextInt();

        int exp = 1;
        for (int i = 1; i <= num2; i++) {
            exp = exp * num2;
        }

        System.out.println("El resultado es: " + exp);
        entrada.close();
    }
}


