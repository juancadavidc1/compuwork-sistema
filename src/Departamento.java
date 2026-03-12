import java.util.ArrayList;

public class Departamento {

    private final String nombre;
    private final ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {

        if (empleado == null) {
            System.out.println("Error: empleado no válido");
            return;
        }

        empleados.add(empleado);
    }

    public void mostrarEmpleados() {

        System.out.println("Departamento: " + nombre);

        for (Empleado e : empleados) {
            e.mostrarInformacion();
            System.out.println("------------");
        }
    }
}