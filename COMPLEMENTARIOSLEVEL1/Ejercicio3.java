import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[]args){
    Scanner secuencia = new Scanner(System.in);

    int num;

    System.out.println("Ingrese el numero");
    num = secuencia.nextInt();
    for (int i = 1; i <= num; i++) {
       for (int j = 1; j <= i; j++){
        System.out.print(j + " ");
        }
    secuencia.close();
}
    System.out.println ("");
    } }
