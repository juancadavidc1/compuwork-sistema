public class ReporteDesempeño {

    private final Empleado empleado;
    private final int puntuacion;

    public ReporteDesempeño(Empleado empleado, int puntuacion) {
        this.empleado = empleado;
        this.puntuacion = puntuacion;
    }

    public void generarReporte() {

        System.out.println("----- REPORTE DE DESEMPEÑO -----");

        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Cargo: " + empleado.getCargo());
        System.out.println("Puntuación: " + puntuacion);
    }
}