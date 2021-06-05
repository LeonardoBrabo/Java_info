import java.util.ArrayList;
import java.util.Scanner;
public class Ejer1{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();

        boolean bandera = true;
        do {
            System.out.print("¿Quiere agregar una ciudad? [s/n]: ");
            switch (entrada.nextLine().charAt(0)) {
                case 's':
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    ciudades.add(entrada.nextLine());
                    break;
                case 'n':
                    bandera = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
                    break;
            }
        } while (bandera);
        System.out.println("Ranking de sus ciudades favoritas: ");
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i+1) + " - " + ciudades.get(i));
        }
        entrada.close();
    }

}