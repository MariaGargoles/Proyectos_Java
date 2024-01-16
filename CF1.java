
import java.util.Scanner;
public class CF1{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        //añadimos el do ya que queremos que el bucle se ejecute al menos una vez

        do{
        System.out.print("Introduce el numero menor: ");
        int numeroMenor = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduce el numero mayor: ");
        int numeroMayor = Integer.parseInt(scanner.nextLine());

            //Pedimos ingresar de nuevo los valores
        while (numeroMenor > numeroMayor) {
            System.out.println("El rango de números no es válido. Introduce el numero menor nuevamente: ");
            numeroMenor = Integer.parseInt(scanner.nextLine());



            System.out.print("Introduce el numero mayor: ");
            numeroMayor = Integer.parseInt(scanner.nextLine());
        }

        while (numeroMenor <= numeroMayor)
        {
            System.out.println(numeroMenor);
            numeroMenor++;
        }

        //Este primer while es el encargado de la funcion de i++

            System.out.print("¿Tienes otra secuenta que añadir? (Presiona 'q' para salir): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("q")) {
                continuar = false;
            }

        } while (continuar);


    }
}