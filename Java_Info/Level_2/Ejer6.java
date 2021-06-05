import java.util.HashMap;
import java.util.HashSet;

public class Ejer6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleadosSet = new HashSet<>();
        HashMap<Integer, Float> salarios = new HashMap<>();

        empleadosSet.add(new Empleado("Empleado 1", 85532142, 1, 99654));
        empleadosSet.add(new Empleado("Empleado 2", 46632223, 2, 54233));
        empleadosSet.add(new Empleado("Empleado 3", 12553232, 3, 56432));
        empleadosSet.add(new Empleado("Empleado 4", 99656525, 6, 11225));

        for (Empleado e : empleadosSet) {
            salarios.put(e.getDni(), e.getSalary());
        }

        salarios.forEach((dni, salario) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + salario));
    }
}

class Empleado {
    String nombre;
    int dni;
    float horastrabajadas;
    float precioxhora;

    public Empleado(String nombre, int dni, float horastrabajadas, float precioxhora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horastrabajadas = horastrabajadas;
        this.precioxhora = precioxhora;
    }

    public int getDni() {
        return dni;
    }

    public float getSalary() {
        return this.horastrabajadas * this.precioxhora;
    }
}
