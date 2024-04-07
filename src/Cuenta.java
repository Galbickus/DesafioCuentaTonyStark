import java.util.Locale;
import java.util.Scanner;

public class Cuenta {
    static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion =0;
        double montoARetirar = 0;
        double montoADepositar = 0;

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $ "+ saldo );
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        /* Text block*/
        String menu = """
                \n*-*-* Escoja una opción *-*-*\n
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
                    System.out.println("Su saldo es: $ " + saldo);
                    break;

                case 2:
                    System.out.println("Ingrese el monto a retirar:");
                    montoARetirar = teclado.nextDouble();
                    if (saldo < montoARetirar){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo -=montoARetirar;
                        System.out.println("Retire su dinero.");
                        System.out.println("Su saldo es: $ " + saldo);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el monto a depositar: $ ");
                    montoADepositar = teclado.nextDouble();
                    saldo +=montoADepositar;
                    System.out.println("Su saldo es: $ " + saldo);
                    break;

                case 9:
                    System.out.println("Cerrando sesión. No olvide retirar su tarjeta.");
                    break;

                default:
                    System.out.println("La opción ingresada no está en el menú. Escoja una opción del menú.");
                    break;
            }
        }
    }
}