import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner arr= new Scanner (System.in);
        int num1;
        int num2;

        ArrayList<Integer> arrEnteros = new ArrayList<Integer>();
        arrEnteros.add(87);
        arrEnteros.add(7);
        arrEnteros.add(12);
        arrEnteros.add(99);
        arrEnteros.add(2);
        System.out.println("Los elementos del arreglo son: ");
        for(int i = 0; i < arrEnteros.size(); i++) 
            System.out.print(arrEnteros.get(i) + ", ");
            System.out.println("\n" + "\n" + "La cantidad de elementos del arreglo es de " + arrEnteros.size());
        // ahora agrego los numeros al principio(15)y al final(28)
        System.out.println("\n" + "Ingrese un numero que quisiera agregar al principio del arreglo");
        num1= arr.nextInt();
        arrEnteros.add(1, num1);
        System.out.println("Ingrese un numero que quisiera agregar al final del arreglo");
        num2= arr.nextInt();
        arrEnteros.add(num2);
        System.out.println("Ahora los elementos del arreglo son: ");
        for(int i = 0; i < arrEnteros.size(); i++) 
        System.out.print(arrEnteros.get(i) + ", ");
        System.out.println("\n"+ "\n" + "La nueva cantidad de elementos del arreglo es de " + arrEnteros.size());
  
}
    }