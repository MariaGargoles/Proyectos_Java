import java.util.Scanner;

public class SalarioNeto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continuar1 = "si";

        while (continuar1.equals("si")) {
            System.out.println("Introduce el salario bruto: ");
            double SalarioBruto = sc.nextDouble();

            if (SalarioBruto < 0) {
                System.out.println("El salario no puede ser negativo");
                sc.close();
                return;
            }

            System.out.println("Numero de hijos: ");
            int NumeroHijos = sc.nextInt();

            if (NumeroHijos < 0) {
                System.out.println("No puede ser negativo");
                sc.close();
                return;
            }

            double retencion = 0.0;

            if (NumeroHijos <= 2) {
                retencion = SalarioBruto * 0.20;
            } else if (NumeroHijos > 2 && NumeroHijos <= 5) {
                retencion = SalarioBruto * 0.15;
            } else if (NumeroHijos > 5 && NumeroHijos <= 7) {
                retencion = SalarioBruto * 0.10;
            } else if (NumeroHijos >= 7) {
                retencion = SalarioBruto * 0.05;
            }

            double SalarioNeto = SalarioBruto - retencion;

            System.out.println("Salario bruto: " + SalarioBruto);
            System.out.println("Retencion: " + retencion);
            System.out.println("Salario neto: " + SalarioNeto);
            System.out.println("-------------------");

            System.out.println("¿Desea hacer un nuevo cálculo? (si/no) ");
            sc.nextLine(); // Consumir la nueva línea
            continuar1 = sc.nextLine();
        }

        sc.close();
    }
}
