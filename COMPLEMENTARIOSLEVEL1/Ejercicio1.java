import java.util.Scanner;
    public class Ejercicio1 {
   public static void main (String[]args){
    Scanner lectura = new Scanner(System.in);
    System.out.println("Ingrese su usuario: ");
    String nombre = lectura.nextLine();
    System.out.println("HOLA " + nombre + "!!!");
    lectura.close();
   }
}
