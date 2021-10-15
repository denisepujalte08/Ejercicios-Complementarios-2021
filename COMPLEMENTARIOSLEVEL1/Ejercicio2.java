import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[]args){
    Scanner operaciones = new Scanner(System.in);
    
    float num1;
    float num2;

    System.out.println("Ingrese el primer numero");
    num1 = operaciones.nextFloat();
    System.out.println("Ingrese el segundo numero");
    num2= operaciones.nextFloat();
   
    System.out.println("La suma de ambos numeros es " + (num1 + num2));
    System.out.println("La resta de ambos es " + (num1 - num2));
    System.out.println("La multiplicacion de ambos numeros es " + (num1 * num2));
    System.out.println("La division de ambos numeros es " + (num1 / num2));
    operaciones.close();
  }
 
}
