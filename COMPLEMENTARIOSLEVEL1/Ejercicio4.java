import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner facto = new Scanner(System.in);

        int num;
        long factorial = 1; 

        System.out.println("Ingrese el numero del que desea saber el factorial");
        num = facto.nextInt();

        for (int i=1; i<=num ;i++){
            factorial *=i;  //multiplicacion iterativa
        }
        System.out.println("El factorial de "+ num +" es " + factorial);

    }

}