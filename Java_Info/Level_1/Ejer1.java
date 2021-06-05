import java.util.Scanner;
 public class Ejer1{
     public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         String nombre;
         System.out.println("Ingrese su nombre: ");
         nombre= entrada.nextLine();
         entrada.close();
         System.out.println("Hola " +nombre);
     }
 }