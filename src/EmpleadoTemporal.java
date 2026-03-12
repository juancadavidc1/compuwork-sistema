public class EmpleadoTemporal extends Empleado {

    private final int duracionContrato;

    public EmpleadoTemporal(int id, String nombre, String cargo, int duracionContrato) {
        super(id, nombre, cargo);
        this.duracionContrato = duracionContrato;
    }

    public int getDuracionContrato() {
        return duracionContrato;
    }
}