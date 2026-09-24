public class Main{

    public static void main(String[] args) {

        Empleado[] equipo = {
            new Supervisor("Oskar","M-809", 5000, 13),
            new Piloto("Ana Gomez", "E-101", 4500.0, 60),
            new TecnicoMantenimiento("Luis Rivas", "E-102", 3800.0, 3),
            new AgenteVentas("Carla Mux", "E-103", 3200.0, 5)
        
        };
            

            for (Empleado e : equipo) {
                System.out.println(
                e.getNombre() + ": Q" + e.calcularSalario());
    }

}
}