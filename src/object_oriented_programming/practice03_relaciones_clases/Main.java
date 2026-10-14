package object_oriented_programming.practice03_relaciones_clases;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("aereo");

        Carro miCarro = new Carro("Honda","HRV", 2019);

        CarroElectrico carroNuevo = new CarroElectrico("Porsche", "Taycan", 2027, 800);

        Vehiculo[] coleccionGeneral = new Vehiculo[3];
        coleccionGeneral[0] = vehiculo;
        coleccionGeneral[1] = miCarro;
        coleccionGeneral[2] = carroNuevo;

        Carro[] coleccionCarros = new Carro[3];
        coleccionCarros[0] = miCarro;
        coleccionCarros[1] = carroNuevo;
        // coleccionCarros[2] = vehiculo; (Error porque Vehiculo no necesariamente es Carro)
    }
}