import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner potencia = new Scanner(System.in);

        int base;
        int exponente;
        int resultado = 1; 

        System.out.println("Ingrese el primer numero, que sera la base de la potencia");
        base = potencia.nextInt();
        
        System.out.println("Ingrese el segundo numero, que sera el exponente");
        exponente = potencia.nextInt();

        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
            }
        System.out.println(base + "^" + exponente + " es " + resultado);
            potencia.close();
    }

}