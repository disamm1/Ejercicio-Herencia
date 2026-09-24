public class Piloto extends Empleado {
    private int horasVuelo;
    private static final double BONO_POR_HORA = 25.0;

    public Piloto(String nombre, String id, double salarioBase, int horasVuelo) {
        super(nombre, id, salarioBase); // (1) constructor del padre
        this.horasVuelo = horasVuelo;
        }


    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasVuelo * BONO_POR_HORA);
        }
}