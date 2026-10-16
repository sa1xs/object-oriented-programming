package object_oriented_programming.practice04.exercise02;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }

}
