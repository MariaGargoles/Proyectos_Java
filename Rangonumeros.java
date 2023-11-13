import java.util.Scanner;

public class Rangonumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.println("Indica el numero mas pequeño: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            int numeromenor = scanner.nextInt();

            System.out.println("Indica el numero mayor: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            int numeromayor = scanner.nextInt();

            if (numeromenor <= numeromayor) {
                for (int i = numeromenor; i <= numeromayor; i++) {
                    System.out.println(i);
                }
            } else {
                System.out.println("El primer numero debe ser menos o igual al segundo numero");
            }

            System.out.println("¿Desea hacer un nuevo cálculo? (si/no) ");
            continuar = scanner.next().toLowerCase();
        }

        scanner.close();
    }
}