    import java.util.Scanner;

    public class Ejercicio8 {
        public static void main(String[] args) {
            Scanner persona = new Scanner(System.in);
                  
            System.out.println("Ingrese su nombre y apellido");
            String nomAp = persona.nextLine();
            System.out.println("Ingrese su edad");
            String edad = persona.nextLine();
            System.out.println("Ingrese su direccion");
            String direc = persona.nextLine();
            System.out.println("Ingrese su ciudad");
            String ciud = persona.nextLine();

            System.out.println(ciud + " - " + direc + " - " + edad + " - " + nomAp);
            persona.close();
        }
    
    }
