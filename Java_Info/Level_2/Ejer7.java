public class Ejer7 {
    public static void main(String[] args) {
        String[] arreglo = fizzBuzz(1, 6);
        for (String s : arreglo) {
            System.out.print(s + " - ");
        }
    }

    public static String[] fizzBuzz(int inicial, int limite) {
        if (limite < inicial)
            throw new RuntimeException("El primer numero debe ser menor al segundo.");

        String[] arreglo = new String[limite - 1];
        arreglo[0] = String.valueOf(inicial);
        for (int i = 1; i < arreglo.length; i++) {
            if (((inicial + i) % 2 == 0) && ((inicial + i) % 3 == 0)) {
                arreglo[i] = "FizzBuzz";
            } else if ((inicial + i) % 3 == 0) {
                arreglo[i] = "Buzz";
            } else if ((inicial + i) % 2 == 0) {
                arreglo[i] = "Fizz";
            } else {
                arreglo[i] = String.valueOf(inicial + i);
            }

        }

        return arreglo;
    }
}
