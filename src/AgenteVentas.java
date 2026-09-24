public class AgenteVentas extends Empleado {
    private int ventasRealizadas;
    private static final double Comision = 15.0;


    public AgenteVentas(String nombre, String id, double salarioBase, int certificaciones) {
        super(nombre, id, salarioBase);
        this.ventasRealizadas = ventasRealizadas;
    }


    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (ventasRealizadas * Comision);
}
}