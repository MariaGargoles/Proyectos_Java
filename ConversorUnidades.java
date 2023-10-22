
public class ConversorUnidades {
    public static void main (String[] args){
        // Scanner input se usa para leer datos de entrada
        Scanner input = new Scanner (System.in);

        System.out.println("Conversor unidades");
        System.out.println("Cantidad a convertir en pies:  ");
        double Lpies = input.nextDouble ();

        //Double es la clase que usaremos para numeros decimales

        //Conversor sabiendo que 12 pulgadas es 1 pie , que 1 m son 3,28 pies y 1yarda son 3 pies

        double LPulgadas = Lpies * 12;
        double LMetros = Lpies /3.28;
        double LYardas = Lpies / 3;

        //Imprimir resultado

        System.out.println("Resultado: ");
        System.out.println("Distancia en pulgadas: " + LPulgadas + " pulg.");
        System.out.println("Distancia en metros: " + LMetros + " m.");
        System.out.println("Distancia en yardas: " + LYardas + " yd.");

        input.close();

    }

}
