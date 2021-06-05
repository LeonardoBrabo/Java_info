import java.util.Scanner;
public class Ejer8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese su ciudad:");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su direccion:");
        String direccion = entrada.nextLine();

        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = entrada.nextInt();

        String datos = ciudad + " - " + direccion + " - " + edad + " - " + nombre;
        System.out.println(datos);
        entrada.close();
      }
}
