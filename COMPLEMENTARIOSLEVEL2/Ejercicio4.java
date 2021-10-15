import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
        alumnos.add("Emanuel Lopez");
        alumnos.add("Valeria Dominguez");
        alumnos.add("Sandra Vallejos");
        alumnos.add("Sol Gonzales");
        alumnos.add("Maria Luz Fernandez");
        alumnos.add("Tomas Rodriguez");
        alumnos.add("Tobias de la Cruz");
        alumnos.add("Analia Sanchez");
        alumnos.add("Lautaro Sanchez");
        alumnos.add("Santiago Fernandez");
        alumnos.add("Tania Ortiz");
        alumnos.add("Juan Garcia");

            List<String> curso1 = alumnos.subList(0, 4);
            List<String> curso2 = alumnos.subList(5, 8);
            List<String> curso3 = alumnos.subList(9, 12);

        System.out.println("Alumnos del primer curso:" + "\n");
        for(int i = 0; i < curso1.size(); i++) 
            System.out.println(curso1.get(i));
        
        System.out.println("\n" + "Alumnos del segundo curso:" + "\n");
        for(int i = 0; i < curso2.size(); i++) 
            System.out.println(curso2.get(i));
        
        System.out.println("\n" + "Alumnos del tercer curso:" + "\n");
        for(int i = 0; i < curso3.size(); i++) 
            System.out.println(curso3.get(i));
    }
}
