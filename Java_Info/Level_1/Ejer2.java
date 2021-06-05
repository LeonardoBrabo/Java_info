import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        float numero1,numero2,suma,resta,multi,divi,resto;

        System.out.print("Ingrese el primer numero: ");
         numero1 = entrada.nextFloat();
        System.out.print("\n Ingrese el segundo numero: ");
         numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        divi = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("La suma es: " +suma);
        System.out.println("La resta es:" +resta);
        System.out.println("La multiplicacion es: " +multi);
        System.out.println("La division es: " +divi);
        System.out.println("El resto de la division es " +resto);

        entrada.close();
    }
}


