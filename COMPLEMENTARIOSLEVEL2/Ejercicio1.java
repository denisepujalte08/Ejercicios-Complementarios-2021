import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args){
        ArrayList<String> ciudadesfav = new ArrayList<String>();
        ciudadesfav.add("Bariloche");
        ciudadesfav.add("Mendoza");
        ciudadesfav.add("Ushuaia");
        ciudadesfav.add("Cordoba");
        ciudadesfav.add("San Salvador de Jujuy");
        System.out.println("Mis ciudades favoritas son:");
        for(int i = 0; i < ciudadesfav.size(); i++) {
            System.out.println(ciudadesfav.get(i));
        //System.out.println("");
    
}
    } }