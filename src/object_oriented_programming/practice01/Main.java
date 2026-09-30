package object_oriented_programming.practice01;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Sebastian", "Salas", "118930419", "Masculino", "Alajuela");
        Cliente cliente2 = new Cliente("Roberto", "Hernandez", "116730521", "Cartago");
        Cliente cliente3 = new Cliente();

        Suscripcion suscripcion1 = new Suscripcion("YouTube Premium", 4.99, (short) 1);
        Suscripcion suscripcion2 = new Suscripcion("Spotify Premium", 7.99, (short) 3);

        cliente1.suscribirse(suscripcion1);
        cliente2.suscribirse(suscripcion2);
        cliente3.suscribirse(
                new Suscripcion("Netflix", 19.99, (short) 30)
        );

        System.out.println(cliente1.equals(cliente1));
        System.out.println(cliente1.equals(cliente3));

        System.out.println(suscripcion1.equals(suscripcion1));
        System.out.println(suscripcion1.equals(suscripcion2));

    }
}