import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleados> empleado = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();
class Empleados {
            private String nombreAp;
            private int dni;
            private float horas_trabajadas;
            private float valor_por_hora;

public Empleados(String nombreAp, int dni, float horas_trabajadas, float valor_por_hora){
        this.nombreAp= nombreAp;
        this.dni = dni;
        this.horas_trabajadas = horas_trabajadas;
        this.valor_por_hora = valor_por_hora;
    }   
empleado.add(new Empleados("Analia Sanchez", 21567986, 6, 345));
empleado.add(new Empleados("Rosario Martines", 9142486, 9, 345));
empleado.add(new Empleados("Tomas Acuna", 35436447, 3, 500));
empleado.add(new Empleados("Rodrigo Campos", 87856758, 10, 167));

for (empleado i: Empleados) {
        int sueld = i.getvalor_por_hora() * i.gethoras_trabajadas();
        sueldos.put(i.getdni, sueld);
        System.out.println("Empleado: " + i.getnompreAp() + ", DNI: " + i.getdni() + "=> Sueldo: " + sueld);
    }

    public int clave() {
        return this.dni;
    }
    public float valor() {

    }
    


    //for(int i = 0; i < empleadp.size(); i++)
      //      sueldo.add( horas_trabajadas.get(i) * valor_por_hora.get(i));

    

    
}
    }
