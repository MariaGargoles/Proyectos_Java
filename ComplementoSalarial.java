import java.util.Scanner;

public class ComplementoSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el salario base del empleado: ");
            double salarioBase = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea

            double complementoSalario = 0.0;

            System.out.println("Ingrese la letra correspondiente al departamento (A, B, C o D): ");
            String departamento = scanner.nextLine().toUpperCase();

            switch (departamento) {
                case "A":
                    complementoSalario = salarioBase * 0.10;
                    break;
                case "B":
                    complementoSalario = salarioBase * 0.15;
                    break;
                case "C":
                    complementoSalario = salarioBase * 0.05;
                    break;
                case "D":
                    complementoSalario = salarioBase * 0.12;
                    break;
                default:
                    System.out.println("Departamento no válido");
                    return;
            }

            double salarioTotal = salarioBase + complementoSalario;

            System.out.println("Departamento: " + NombreDepartamento(departamento));
            System.out.println("Complemento de Salario: " + complementoSalario);
            System.out.println("Salario Total para " + nombre + ": " + salarioTotal);
            System.out.println("-------------------");

            System.out.println("¿Desea hacer un nuevo cálculo? (si/no) ");
            continuar = scanner.nextLine();
        }
    }

    public static String NombreDepartamento(String departamento) {
        switch (departamento) {
            case "A":
                return "Desarrollo";
            case "B":
                return "Finanzas";
            case "C":
                return "RRHH";
            case "D":
                return "Mercado";
            default:
                return "Departamento desconocido";
        }
    }
}
