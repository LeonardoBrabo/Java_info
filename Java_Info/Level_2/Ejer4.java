import java.util.ArrayList;
import java.util.List;

public class Ejer4 {
    
    public static void main(String[] args) {
        ArrayList<String> Estudiantes = new ArrayList<>();
    
        Estudiantes.add("Jonny Nasco");
        Estudiantes.add("Luz Roja");
        Estudiantes.add("Ana Busado de Hesa");
        Estudiantes.add("Lola Mento");
        Estudiantes.add("Ana Tomía");
        Estudiantes.add("Susana Torio");
        Estudiantes.add("Jorge Nitales");
        Estudiantes.add("Elsa Capunta");
        Estudiantes.add("Juanca Dáver");
        Estudiantes.add("Omar Icón");
        Estudiantes.add("Elver Galarza");
        Estudiantes.add("Víctor Tilla");

        List<String>curso1 = Estudiantes.subList(0,4);

        List<String> curso2 = Estudiantes.subList(4,8);

        List<String> curso3 = Estudiantes.subList(8, Estudiantes.size());


        System.out.println("Primer curso");
        System.out.println(" ");
        for (String estudiante :curso1) {
            System.out.println(estudiante);
        }
        System.out.println("\nSegundo curso");
        System.out.println(" ");
        for (String estudiante : curso2) {
            System.out.println(estudiante);
        }
        System.out.println("\nTercer curso");
        System.out.println(" ");
        for (String estudiante : curso3) {
            System.out.println(estudiante);
        }
        
    }
}
