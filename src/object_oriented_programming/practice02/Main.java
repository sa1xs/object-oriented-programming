package object_oriented_programming.practice02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Sebastian", "Salas");
        Persona persona2 = new Persona("Roberto", "Hernandez");

        Pasaporte pasaporte1 = new Pasaporte(
                "CR123456",
                "Costarricense",
                "01/01/2025",
                "01/01/2030",
                true
        );

        Pasaporte pasaporte2 = new Pasaporte(
                "CR987654",
                "Costarricense",
                "01/01/2018",
                "01/01/2023",
                false
        );

        persona1.sacarPasaporte(pasaporte1);
        persona2.sacarPasaporte(pasaporte2);

        persona1.tomarVuelo("España");
        persona2.tomarVuelo("México");

        Mascota mascota1 = new Mascota(
                "Nubo",
                "Perro",
                2
        );

        Mascota mascota2 = new Mascota(
                "Oshi",
                "Gato",
                4
        );

        persona1.adoptarMascota(mascota2);
        persona2.adoptarMascota(mascota1);

        persona1.jugar();
        persona2.jugar();

        ArrayList<String> metales = new ArrayList<>();

        metales.add("hierro");
        metales.add("acero");
        metales.add("aluminio");

        MaquinaSoldar maquina = new MaquinaSoldar(
                "Miller",
                "ME123X",
                "2000W",
                metales
        );

        persona1.soldar(maquina, "hierro");
        persona1.soldar(maquina, "titanio");
    }
}