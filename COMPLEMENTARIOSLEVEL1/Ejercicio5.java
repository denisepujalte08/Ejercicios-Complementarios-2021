import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado = 0;
        int i;
	
        System.out.println("Introduce el primer número:");			
        numero1 = lectura.nextInt();
                    
        System.out.println("Introduce el segundo número:");
        numero2 = lectura.nextInt();

        for (i=1; i<=numero2; i++) {
            resultado= resultado+numero1;
            System.out.println();
        }
        System.out.println( numero1 + " * " + numero2 + " = " + resultado);


    }
    
}