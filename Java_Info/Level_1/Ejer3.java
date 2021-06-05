import java.util.Scanner;
public class Ejer3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        for(int i = 1; i<=numero; i++){

            for(int j = 1; j<= i; j++){
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }
        entrada.close();
    }
}
