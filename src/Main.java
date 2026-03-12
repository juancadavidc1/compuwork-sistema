public class Main {

    public static void main(String[] args) {

        EmpleadoPermanente emp1 =
                new EmpleadoPermanente(1, "Carlos", "Ingeniero", 4000);

        EmpleadoTemporal emp2 =
                new EmpleadoTemporal(2, "Ana", "Analista", 6);

        Departamento tecnologia =
                new Departamento("Tecnologia");

        tecnologia.agregarEmpleado(emp1);
        tecnologia.agregarEmpleado(emp2);

        tecnologia.mostrarEmpleados();

        ReporteDesempeño reporte =
                new ReporteDesempeño(emp1, 90);

        reporte.generarReporte();
    }
}