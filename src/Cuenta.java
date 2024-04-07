import java.util.Locale;
import java.util.Scanner;

public class Cuenta {
    static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion =0;

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $ "+ saldo );
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*");

        /* Text block*/
        String menu = """
                *-*-* Escoja una opción*-*-*
                1 - Consultar saldo
                2 - Retiro
                3 - Depositar
                9 - Salir
                """;
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actual es: $ " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar:");
                    double montoARetirar = teclado.nextDouble();
                    if (saldo){

                    }

            }


        }

    }
}