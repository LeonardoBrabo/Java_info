import java.util.ArrayList;

public class Ejer2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros  = new ArrayList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(7);
        numeros.add(3);
        numeros.add(9);

        for(int i = 0; i < numeros.size(); i++){
          System.out.println(numeros.get(i));
        }

        System.out.println("El tamanio de la lista es " + numeros.size());
        numeros.add(0, 10);
        numeros.add(11);

        for(int i = 0; i < numeros.size(); i++){
          System.out.println(numeros.get(i));
        }
        
        System.out.println("El tamaño de la lista es " + numeros.size());
      }
}
