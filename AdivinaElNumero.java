import java.util.Scanner;
import java.util.Random;;

public class AdivinaElNumero{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Concepto: Variables y constantes
        final int NUMERO_MAXIMO = 100; //El rango del numero a adivinar
        int numeroSecreto = random.nextInt(NUMERO_MAXIMO) + 1;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("Bienvenido a Avidina el Numero!");
        System.out.println("He pensado un número entre 1 y " 
        + NUMERO_MAXIMO + "¿Puedes a adivinar cual es?");

        //Concepto: bucles y control de flujo
        while (!adivinado) {
            System.out.println("Introduce tu interno: ");
            int numeroUsuario = scanner.nextInt();
            intentos++;

            //Concepto: Condicionales
            if (numeroUsuario == numeroSecreto) {
                adivinado = true;
                System.out.println("Felicitaciones, han adivinado el numero en " + intentos +"intentos.");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor intentalo de nuevo.");
            } else{
                System.out.println("El número es menor, inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}